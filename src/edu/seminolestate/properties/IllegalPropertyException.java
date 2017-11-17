package edu.seminolestate.properties;

public class IllegalPropertyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public IllegalPropertyException() {
		super("Invalid values sent to method");
	}
	
	public IllegalPropertyException(String message) {
		super(message);
	}

}
