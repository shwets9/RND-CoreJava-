package com.shweta.carparkingparking.parking_details.model;

public class CustomerDetails {
	
	String carOwner;
	String phoneNo;
	
	public CustomerDetails(String carOwner, String phone) {
		super();
		this.carOwner = carOwner;
		this.phoneNo = phone;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "CustomerDetails [carOwner=" + carOwner + ", phoneNo=" + phoneNo + "]\n";
	}
	
}
