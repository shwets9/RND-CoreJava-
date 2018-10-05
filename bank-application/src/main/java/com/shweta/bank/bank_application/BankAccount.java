package com.shweta.bank.bank_application;

/** this comment is documentation based comment
 * 
 * @author ssrivas9
 * @since 03-10-2018
 *
 */

public abstract class BankAccount implements Comparable<BankAccount> {
	
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;

	// init block
	{
		accountNo = ++autoAccountNoGen;
	}
	
	public BankAccount() {  
		accountHolderName = "Unknown"; 
		accountBalance = 0; 
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}	
	
	public void withdraw(double amount) {
		accountBalance -= amount;
	}
	
	public void deposit(double amount) {
		accountBalance += amount;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}

	@Override
	public int compareTo(BankAccount account) {
		return account.getAccountNo()+getAccountNo();
		
	}

}
