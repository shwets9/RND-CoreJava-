package com.shweta.bank.bank_application;

import com.shweta.bank.bank_application.inter.Interest;

public class SavingsAccount2 extends SavingsAccount implements Interest {
	
	int insuranceId;
	String insuranceName;
	
	public SavingsAccount2() {
		super();
		this.insuranceId = 567;
		this.insuranceName = "JanDhanYojna";
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public double getInsuranceValue() {
		return 500.0*interestRate;
	}

	public String getInsuranceName() {
		return insuranceName;
	}
	

}
