package com.shweta.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.shweta.model.Student;

public class Test {
	
	public static void main(String[] args) { 
		  
		 
		  		List<Student> stuList = new ArrayList<>(); 
		  		stuList.add(new Student("Sean", 20)); 
		  		stuList.add(new Student("Andrew", 16)); 
		  		stuList.add(new Student("Frank", 26)); 
		  		 
		 		System.out.println("Students before sorting:"); 
		  		stuList.forEach(System.out::println); 
		  		 
				Comparator<Student> studentNameComp = (s1,s2)->s1.getName().compareTo(s2.getName()); 
		  		 
		  		Collections.sort(stuList, studentNameComp); 
		  		System.out.println("Students after sorting:"); 
		  		System.out.println("---------------------------"); 
		  		stuList.forEach(System.out::println); 
		  	} 


}
