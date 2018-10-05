package com.shweta.bank.bank_application;

public class SavingsAccount extends BankAccount{
	

	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String accountHolderName, double accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Saving account Withdraw method");
	}
	
	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}

	
	

}
