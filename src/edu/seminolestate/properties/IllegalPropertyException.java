package edu.seminolestate.properties;

//Author: Jason Kellie - 11/19/17

public class IllegalPropertyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public IllegalPropertyException() {
		super("Invalid values sent to method");
	}
	
	public IllegalPropertyException(String message) {
		super(message);
	}

}
