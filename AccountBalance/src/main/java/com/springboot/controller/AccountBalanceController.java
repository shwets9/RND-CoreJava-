package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.BankAccount;
import com.springboot.service.AccountBalanceService;

@RestController
public class AccountBalanceController {
	
	@Autowired
	AccountBalanceService accountBalService;
	
	@RequestMapping(value ="/getAccBal/{accountNumber}", method = RequestMethod.GET)
	public int getAccBal(@PathVariable("accountNumber") final int accountNumber) {
		
		System.out.println(accountNumber);
		return accountBalService.getAccBal(accountNumber);
		
	}
	
	@RequestMapping(value ="/create", method = RequestMethod.GET)
	public BankAccount create(@RequestParam int accountNumber, @RequestParam int accountBalance) {	
		BankAccount bankAccount = accountBalService.create(accountNumber, accountBalance);
		return bankAccount;
	}

}
