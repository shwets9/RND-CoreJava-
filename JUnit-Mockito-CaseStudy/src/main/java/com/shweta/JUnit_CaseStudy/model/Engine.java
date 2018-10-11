package com.shweta.JUnit_CaseStudy.model;

public class Engine {
	private boolean running; //value = false
	public boolean isRunning() {
		return running;  //value = false
	}
	
	public void start() {
		running = true;
	}
	
	public void stop( ) {
		running = false;
	}

}
