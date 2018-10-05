package com.shweta.carparking.parking_details;

import com.shweta.carparking.parking_details.service.CarParkingOperation;
import com.shweta.carparkingparking.parking_details.model.CustomerDetails;
import com.shweta.carparkingparking.parking_details.model.ParkingId;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	       CustomerDetails cd1 = new CustomerDetails("Shweta1","8357983746");
    	       CustomerDetails cd2 = new CustomerDetails("Shweta2","8357983746");
    	       CustomerDetails cd3 = new CustomerDetails("Shweta3","8357983746");
    	       CustomerDetails cd4 = new CustomerDetails("Shweta1","8357983746");
    	       CustomerDetails cd5 = new CustomerDetails("Shweta2","8357983746");
    	       CustomerDetails cd6 = new CustomerDetails("Shweta3","8357983746");
    	       CustomerDetails cd7 = new CustomerDetails("Shweta1","8357983746");
    	       CustomerDetails cd8 = new CustomerDetails("Shweta2","8357983746");
    	       CustomerDetails cd9 = new CustomerDetails("Shweta3","8357983746");
    	       CustomerDetails cd10 = new CustomerDetails("Shweta1","8357983746");
    	       CustomerDetails cd11 = new CustomerDetails("Shweta2","8357983746");
    	       CustomerDetails cd12 = new CustomerDetails("Shweta3","8357983746");

    	       CarParkingOperation po = new CarParkingOperation();
    	       ParkingId pid=po.addNewCarDetails(cd1);
    	       po.addNewCarDetails(cd2);
    	       po.addNewCarDetails(cd3);
    	       po.addNewCarDetails(cd4);
    	       po.addNewCarDetails(cd5);
    	       po.addNewCarDetails(cd6);
    	       po.addNewCarDetails(cd7);
    	       po.addNewCarDetails(cd8);
    	       po.addNewCarDetails(cd9);
    	       po.addNewCarDetails(cd10);
    	       po.addNewCarDetails(cd11);
    	       po.addNewCarDetails(cd12);
    	       
    	       System.out.println(po.getAllDetails());
    	       ParkingId pid1= new ParkingId(1,1,1);
    	       System.out.println(po.retrieveByParkingId(pid1));

    	    
    }
}
