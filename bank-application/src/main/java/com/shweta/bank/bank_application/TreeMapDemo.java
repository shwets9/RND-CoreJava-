package com.shweta.bank.bank_application;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
				
				TreeMap<Integer,String> trmap = new TreeMap<Integer,String>();
				trmap.put(1, "Shweta");
				trmap.put(2,"Dhanya");
				trmap.put(3,"Khushboo");
				trmap.put(4, "Rabiya");
				trmap.put(5,"Nandini");
				
				System.out.println(trmap.get(1));
				System.out.println(trmap.get(2));
				System.out.println(trmap.get(3));
				System.out.println(trmap.get(4));
				System.out.println(trmap.get(5));
				
				System.out.println("==============================================================");
				
				Set<Map.Entry<Integer, String>> set = trmap.entrySet();
				for(Map.Entry<Integer, String> me : set) {
					System.out.print(me.getKey() + ": ");
					System.out.println(me.getValue());
					}
				
				System.out.println("==============================================================");
				
				System.out.println("Size of TreeMap :" + trmap.size());
				
				System.out.println("==============================================================");
				
				trmap.clear();
				System.out.println(trmap);
				
				System.out.println("==============================================================");
				
				trmap.put(5,"Nandini");
				trmap.put(1, "Shweta");
				trmap.put(3,"Khushboo");
				trmap.put(2,"Dhanya");
				trmap.put(4, "Rabiya");
				

				Set<Map.Entry<Integer, String>> set2 = trmap.entrySet();
				for(Map.Entry<Integer, String> me2 : set2) {
					System.out.print(me2.getKey() + ": ");
					System.out.println(me2.getValue());
					}
				System.out.println("==============================================================");
				
				System.out.println("Keys :");
				for ( Integer key : trmap.keySet() ) {
				    System.out.println( key );
				} 
				
				System.out.println("==============================================================");
				
				System.out.println("Values :");
				Set<Map.Entry<Integer, String>> set1 = trmap.entrySet();
				for(Map.Entry<Integer, String> me1 : set1) {
					System.out.println(me1.getValue());
				}
				
			}

  



}
