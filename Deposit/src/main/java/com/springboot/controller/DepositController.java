package com.springboot.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.model.BankAccount;
import com.springboot.service.DepositService;

@RestController
public class DepositController {

	@Autowired
	DepositService depositService;
	@Autowired
	private LoadBalancerClient loadBalancer;

	@RequestMapping(value = "/deposit")
	public BankAccount deposit(@RequestParam int accountNumber, @RequestParam int amount) {

		ServiceInstance serviceInstance = loadBalancer.choose("GetAccountBalance");
		String baseUrl = serviceInstance.getUri().toString();
		baseUrl = baseUrl + "/getAccBal/" + accountNumber;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Integer> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), Integer.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		int accountBalance = response.getBody();
		return depositService.deposit(accountNumber, amount, accountBalance);

	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
