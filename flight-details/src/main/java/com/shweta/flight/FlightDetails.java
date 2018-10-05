package com.shweta.flight;

public class FlightDetails {

	int flightNo;
	String airline;
	int flightPrice;
	String sourceCity;
	String destinationCity;
	int arrivalTime;
	int departureTime;
	int journeyTime = arrivalTime-departureTime;
	
	public FlightDetails() {
		super();
	}

	public FlightDetails(int flightNo, String airline, int flightPrice, String sourceCity, String destinationCity,
			 int departureTime , int arrivalTime) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.flightPrice = flightPrice;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.journeyTime = arrivalTime-departureTime;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(int flightPrice) {
		this.flightPrice = flightPrice;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
	public int getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(int journeyTime) {
		this.journeyTime = journeyTime;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightNo=" + flightNo + ", airline=" + airline + ", flightPrice=" + flightPrice
				+ ", sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", journeyTime=" + journeyTime + "]";
	}
	
	

}
