package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.BankAccount;
import com.springboot.repository.WithdrawRepository;

@Service
public class WithdrawService {
	
	@Autowired
	private WithdrawRepository withdrarwRepository ;

	public BankAccount withdraw(int accountNumber, int amount) {
		BankAccount bankAcc = withdrarwRepository.findByAccountNumber(accountNumber);
		bankAcc.setAccountBalance(bankAcc.getAccountBalance() - amount);
		return withdrarwRepository.save(bankAcc);
	}

}
