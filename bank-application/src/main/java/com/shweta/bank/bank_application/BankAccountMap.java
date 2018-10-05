package com.shweta.bank.bank_application;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BankAccountMap {
	
	Map<Integer, BankAccount> bankAccountMap;
	
	public BankAccountMap() {
		bankAccountMap = new HashMap<>();
	}
	
	public void addNewBankAccountForEmployee(int empId, BankAccount acc ) {
		bankAccountMap.put(empId, acc);
	}
	
	public Set<Integer> getAllEmployeeId() {
		return bankAccountMap.keySet();
	}
	
	public Collection<BankAccount> getAllBankAccount() {
		return bankAccountMap.values();
	}
	
	public Set<Map.Entry<Integer, BankAccount>> getAllEmployeeBankAccountDetails() {
		return bankAccountMap.entrySet();
	}


}
