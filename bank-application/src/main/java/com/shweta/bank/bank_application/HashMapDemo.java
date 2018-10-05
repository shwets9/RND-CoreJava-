package com.shweta.bank.bank_application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hsmap = new HashMap<Integer,String>();
		hsmap.put(1, "Shweta");
		hsmap.put(2,"Dhanya");
		hsmap.put(3,"Khushboo");
		hsmap.put(4, "Rabiya");
		hsmap.put(5,"Nandini");
		
		System.out.println(hsmap.get(1));
		System.out.println(hsmap.get(2));
		System.out.println(hsmap.get(3));
		System.out.println(hsmap.get(4));
		System.out.println(hsmap.get(5));
		
		System.out.println("==============================================================");
		
		Set<Map.Entry<Integer, String>> set = hsmap.entrySet();
		for(Map.Entry<Integer, String> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			}
		
		System.out.println("==============================================================");
		
		System.out.println("Size of HashMap :" + hsmap.size());
		
		System.out.println("==============================================================");
		
		hsmap.clear();
		System.out.println(hsmap);
		
		System.out.println("==============================================================");
		
		hsmap.put(5,"Nandini");
		hsmap.put(1, "Shweta");
		hsmap.put(3,"Khushboo");
		hsmap.put(2,"Dhanya");
		hsmap.put(4, "Rabiya");
		
		
		System.out.println("Keys :");
		for ( Integer key : hsmap.keySet() ) {
		    System.out.println( key );
		} 
		
		System.out.println("==============================================================");
		
		System.out.println("Values :");
		Set<Map.Entry<Integer, String>> set1 = hsmap.entrySet();
		for(Map.Entry<Integer, String> me1 : set1) {
			System.out.println(me1.getValue());
		}
		
		System.out.println("==============================================================");
		System.out.println("Sorting HashMap based on keys");
		
		Set<Integer> ids = hsmap.keySet();
		System.out.println("unsorted keys of map : " + ids);
		List<Integer> sortedIds = new ArrayList<>(ids);
		Collections.sort(sortedIds);
		System.out.println("sorted keys of map : " + sortedIds);
		
		Collection<String> id = hsmap.values();
		System.out.println("unsorted keys of map : " + id);
		List<Integer> sortedId = new ArrayList<>(id);
		Collections.sort(sortedId);
		System.out.println("sorted keys of map : " + sortedId);
		
	}

}
