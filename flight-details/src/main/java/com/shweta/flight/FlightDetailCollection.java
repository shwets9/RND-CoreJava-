package com.shweta.flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class FlightDetailCollection {

	LinkedList<FlightDetails> flightList;
	ArrayList<FlightDetails> morningFlights;
	
	 public FlightDetailCollection() {
		 flightList =  new LinkedList<FlightDetails>();
 	}
	
	public void addNewFlightDetails(FlightDetails flightDetails) {
		flightList.add(flightDetails);
	}
	    
	public LinkedList<FlightDetails> getAllFlightDetails() {
  		  return flightList;	
  	}
	
	public LinkedList<FlightDetails> removeByFlightNo(int flightNo) {
        for (FlightDetails flight : flightList) {
               if (flight.getFlightNo() == flightNo) {
            	   flightList.remove(flight);
                     return flightList;
               }
        }
        throw new RuntimeException("Flight Number not found");
 }

	
    public LinkedList<FlightDetails> updateFlightByDeparture(int flightNo, int departureTime, int arrivalTime) {
	    	 for(FlightDetails flight: flightList) {
	    		 if(flight.getFlightNo() == flightNo) {
	    			 flight.setDepartureTime(departureTime);
	    			 flight.setArrivalTime(arrivalTime); 
	    			 flight.setJourneyTime(arrivalTime-departureTime);
			          return flightList;
				 }
	    	 }
		 
		 throw new RuntimeException("Flight searched does not exist");
	}
    
    public LinkedList<FlightDetails> updateFlightByDestination(int flightNo, String destinationCity, int departureTime, int arrivalTime) {
   	 for(FlightDetails flight: flightList) {
   		 if(flight.getFlightNo() == flightNo) {
   			 flight.setDestinationCity(destinationCity);
   			 flight.setDepartureTime(departureTime);
   			 flight.setArrivalTime(arrivalTime); 
   			 flight.setJourneyTime(arrivalTime-departureTime);
		          return flightList;
			 }
   	 }
	 
	 throw new RuntimeException("Flight searched does not exist");
}
    
    public LinkedList<FlightDetails> sortFlightByJourneyTime() {
   	 Collections.sort(flightList,(FlightDetails flight1, FlightDetails flight2) 
   			 -> flight1.getJourneyTime() - flight2.getJourneyTime()); 	
		return flightList; 
    }
    
    public LinkedList<FlightDetails> sortFlightByCheapest() {
      	 Collections.sort(flightList,(FlightDetails flight1, FlightDetails flight2) 
      			 -> flight1.getFlightPrice() - flight2.getFlightPrice()); 	
   		return flightList; 
    }
    
    public ArrayList<FlightDetails> sortFlightByMorningTime() {
    	for(FlightDetails flight: flightList) {
    		if((flight.getDepartureTime()>=6) && (flight.getDepartureTime()<=11))
    			morningFlights.add(flight);
    		Collections.sort(morningFlights,(FlightDetails flight1, FlightDetails flight2) 
          			 -> flight1.getDepartureTime() - flight2.getDepartureTime()); 	
    		    return morningFlights;
    	}
    	throw new RuntimeException("Flight searched does not exist");	
   }
    
    public static void main(String[] args) {
    	
    	   FlightDetailCollection list = new FlightDetailCollection();
		   list.addNewFlightDetails(new FlightDetails(2345,"Vistara",8500,"Bangalore","New Delhi",600,800));
		   list.addNewFlightDetails(new FlightDetails(6734,"Indigo",2500,"Goa","Bangalore",1000,1600));
		   list.addNewFlightDetails(new FlightDetails(6564,"JetAirways",4500,"Bangalore","Mumbai",1800,2400));
		   

		   for(FlightDetails fly:list.getAllFlightDetails()) {
			   System.out.println(fly);
		   }
		   
		   
		   for(FlightDetails fly:list.updateFlightByDeparture(6734, 1200, 1900)) {
			   System.out.println(fly);
		   }

		   for(FlightDetails fly:list.updateFlightByDestination(6564, "Chennai", 1300, 1330)) {
			   System.out.println(fly);
		   }
		 
		   for(FlightDetails fly:list.removeByFlightNo(2345)) {
			   System.out.println(fly);
		   }
		   
		   for(FlightDetails fly:list.sortFlightByCheapest()) {
			   System.out.println(fly);
		   }
		  
		   for(FlightDetails fly:list.sortFlightByJourneyTime()) {
			   System.out.println(fly);
		   }
		   
		   for(FlightDetails fly:list.sortFlightByMorningTime()) {
			   System.out.println(fly);
		   }
		  
	}
    
    
    
       
}
