package com.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "BankDetails")
public class BankAccount {
	
	@Id
	private int id;
	private int accountNumber;
	private int accountBalance;
	
	public BankAccount(int accountNumber, int accountBalance) {
		
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankPojo [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}
