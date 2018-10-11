package com.shweta.myInterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.shweta.interfaces.MyInterface;
import com.shweta.model.Student;

public class MyClass extends Object implements MyInterface { 
	  
	 
	  	@Override 
	  	public Integer getMaxNum(List<Integer> intList) { 
	  		Integer maxNum = Collections.max(intList); 
	  		return maxNum; 
	  	} 
	  	 
	  	 public List<Student> sortStudents(List<Student> stuList){ 
	  		return stuList; 
		} 


}
