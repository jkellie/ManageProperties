package edu.seminolestate.properties;

import java.io.Serializable;

public class House extends Property implements Serializable {
	private static final long serialVersionUID = 1L;
	private double lotSize;
	

	public House(int propertyID, String address, String city, String state, String zip, double value,
			double squareFeet, double numberOfBaths, int numberOfBedrooms, double lotSize) {
		super(propertyID, address, city, state, zip, value, squareFeet, numberOfBaths, numberOfBedrooms);
		this.setLotSize(lotSize);
	}
	
	public double getLotSize() {
		return lotSize;
	}
	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}
	
	public String toString( ) {
		return "change this";
	}
}
