package com.shweta.carparking.parking_details.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.shweta.carparkingparking.parking_details.model.CustomerDetails;
import com.shweta.carparkingparking.parking_details.model.ParkingId;

public class CarParkingOperation {
	
	static int carCount = 0;
	static int floor = 1;
	static int section = 1;
	static int compartment = 0;
	
	Map<ParkingId, CustomerDetails> carParkingDetails;
	
	public CarParkingOperation() {
		carParkingDetails = new HashMap<>();	
	}
	
	private ParkingId generateNewParkingId() {
		++carCount;
		compartment++;
		if (compartment > 10) {
			compartment = 1;
			section++;
			if (section > 4) {
				section = 1;
				floor++;
				if (floor > 4) {
					if (carCount == 160) {
						throw new RuntimeException("Parking Full");
					} else {

					}
				}
			}
		}
		ParkingId pId = new ParkingId(floor, section, compartment);
		return pId;

	}

	public ParkingId addNewCarDetails(CustomerDetails car) {
		ParkingId pId = generateNewParkingId();
		carParkingDetails.put(pId, car);
		return pId;
	}
	
	public Set<Map.Entry<ParkingId, CustomerDetails>> getAllDetails()
	{
		return carParkingDetails.entrySet();
	}
	
	public CustomerDetails retrieveByParkingId(ParkingId pid1)
	{	
		CustomerDetails cd=null;
		Set<ParkingId> parkingSlotSet=carParkingDetails.keySet();
		for(ParkingId obj:parkingSlotSet)
			if((obj.getFloor()==pid1.getFloor())&&(obj.getSection()==pid1.getSection())&&(obj.getCompartment()==pid1.getCompartment()))
			{
				cd=carParkingDetails.get(obj);
				break;
			}
		return cd;
		
	}
	
	public CustomerDetails removeCarByParkingId(ParkingId pid1)
	{	
		CustomerDetails cd=null;
		Set<ParkingId> parkingSlotSet=carParkingDetails.keySet();
		for(ParkingId obj:parkingSlotSet)
			if((obj.getFloor()==pid1.getFloor())&&(obj.getSection()==pid1.getSection())&&(obj.getCompartment()==pid1.getCompartment()))
			{
				cd=carParkingDetails.remove(obj);
				carCount--;
				break;
			}
		return cd;
		
	}


}
