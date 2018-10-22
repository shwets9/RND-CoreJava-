package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.BankAccount;
import com.springboot.repository.DepositRepository;

@Service
public class DepositService  {
	
	@Autowired
	DepositRepository depositRepo;
	
	public BankAccount deposit(int accountNumber, int amount, int accountBalance) {
		
		BankAccount bankAcc = depositRepo.findByAccountNumber(accountNumber);
		bankAcc.setAccountBalance(accountBalance + amount);
		return depositRepo.save(bankAcc);
		
	}

}
