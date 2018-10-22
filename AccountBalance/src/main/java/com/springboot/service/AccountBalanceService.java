package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.BankAccount;
import com.springboot.repository.AccountBalanceRepository;

@Service
public class AccountBalanceService {
	
	@Autowired
	AccountBalanceRepository accbalRepo;
	
	public int getAccBal(int accountNumber) {
		return accbalRepo.findByAccountNumber(accountNumber).getAccountBalance();
		
	}
	
	public BankAccount create(int accountNumber, int accountBalance) {
		BankAccount bankAccount = accbalRepo.save(new BankAccount(accountNumber,accountBalance));
		return bankAccount;
	}
	

}
