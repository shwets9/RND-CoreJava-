package com.shweta.bank.bank_application.cust;

import com.shweta.bank.bank_application.BankAccount;
import com.shweta.bank.bank_application.BankAccountList;
import com.shweta.bank.bank_application.SavingsAccount;

public class Customer {
	

	public static void main(String[] args) {
		
		BankAccount acc = null;
		acc = new SavingsAccount();
		
		//acc.isSalaryAccount();
		/** #NotPossible bcoz aa is referring structure of BankAccount 
		 *  and BankAccount does not have isSalaryAccount() method.
		 *  It is specialization of SavigsAccount an not BankAccount.
		 */
//		SavingsAccount acc1 = new SavingsAccount();
//		System.out.println(acc1);
//		acc1.withdraw(5000);
//		System.out.println(acc1);
		
	}

}
