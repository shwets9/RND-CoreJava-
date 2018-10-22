package com.springboot.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Bankdetails")
public class BankAccount {
	
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
	

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "BankPojo [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}
