package com.shweta.LoggerDemo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	
	private final Logger log = LoggerFactory.getLogger(CarService.class);
	
	public void process(String input) {
		
		/*  if(log.isDebugEnabled()) {
			log.debug("processing car: " +input); consumes lot of time of CPU
			we should prevent this type of string concatenation   */
		
		log.warn("processing car: {}",input); // this refers that the user want to log on debug, 
												//so it checks that isDebugEnabled() & 
											    //if debug is enabled only then concatenate 
												//the first string with another string.
	
		
	}

}
