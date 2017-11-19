package edu.seminolestate.properties;

//Author: Jason Kellie - 11/19/17

import java.io.Serializable;

public class Apartment extends Property implements Serializable {
	private static final long serialVersionUID = 1L;
	private double unitRent;
	
	public Apartment(int propertyID, String address, String city, String state, String zip, double value,
			double squareFeet, double numberOfBaths, int numberOfBedrooms, double unitRent)
					throws IllegalPropertyException {
		super(propertyID, address, city, state, zip, value, squareFeet, numberOfBaths, numberOfBedrooms);
		this.setUnitRent(unitRent);
	}

	public double getUnitRent() {
		return unitRent;
	}
	public void setUnitRent(double unitRent) throws IllegalPropertyException {
		if (unitRent > 0)
			this.unitRent = unitRent;
		else
			throw new IllegalPropertyException("The unit rent entered must be greater than 0.");
	}
	
	public String toString( ) {
		return super.toString() + " " +
				getClass() + " [unitRent=" + unitRent + "]";
	}

}
