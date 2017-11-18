package edu.seminolestate.properties;

import java.io.Serializable;

public class House extends Property implements Serializable {
	private static final long serialVersionUID = 1L;
	private double lotSize;

	public House(int propertyID, String address, String city, String state, String zip, double value,
			double squareFeet, double numberOfBaths, int numberOfBedrooms, double lotSize)
					throws IllegalPropertyException {
		super(propertyID, address, city, state, zip, value, squareFeet, numberOfBaths, numberOfBedrooms);
		this.setLotSize(lotSize);
	}

	public double getLotSize() {
		return lotSize;
	}
	public void setLotSize(double lotSize) throws IllegalPropertyException {
		if (lotSize > 0)
			this.lotSize = lotSize;
		else
			throw new
			IllegalPropertyException("The lot size entered must be greater than 0.");
	}
	
	@Override
	public String toString( ) {
		return super.toString() + " " +
				getClass() + " [lotSize=" + lotSize + "]";
	}
}
