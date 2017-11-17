package edu.seminolestate.properties;

import java.io.Serializable;

public class Apartment extends Property implements Serializable {
	private static final long serialVersionUID = 1L;
	private double unitRent;
	
	public Apartment(int propertyID, String address, String city, String state, String zip, double value,
			double squareFeet, double numberOfBaths, int numberOfBedrooms, double unitRent) {
		super(propertyID, address, city, state, zip, value, squareFeet, numberOfBaths, numberOfBedrooms);
		this.setUnitRent(unitRent);
	}

	public double getUnitRent() {
		return unitRent;
	}
	public void setUnitRent(double unitRent) {
		this.unitRent = unitRent;
	}
	
	public String toString( ) {
		return "change this";
	}

}
