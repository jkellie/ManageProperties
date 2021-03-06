package edu.seminolestate.properties;

//Author: Jason Kellie - 11/19/17

import java.io.Serializable;

public abstract class Property implements Serializable, Comparable<Property> {
	private static final long serialVersionUID = 1L;
	private int propertyID;
	private String address;
	private String city;
	private String state;
	private String zip;
	private double value;
	private double squareFeet;
	private double numberOfBaths;
	private int numberOfBedrooms;
	
	public Property(int propertyID, String address, String city, String state, String zip, double value,
			double squareFeet, double numberOfBaths, int numberOfBedrooms) throws IllegalPropertyException {
		this.setPropertyID(propertyID);
		this.setAddress(address);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setValue(value);
		this.setSquareFeet(squareFeet);
		this.setNumberOfBaths(numberOfBaths);
		this.setNumberOfBedrooms(numberOfBedrooms);
	}
	
	public int getPropertyID() {
		return propertyID;
	}
	public void setPropertyID(int propertyID) throws IllegalPropertyException {
		if (propertyID > 0)
			this.propertyID = propertyID;
		else
			throw new IllegalPropertyException("The property id entered must be greater than 0.");
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) throws IllegalPropertyException {
		if (address != null || address.length() > 0)
			this.address = address;
		else
			throw new IllegalPropertyException("An address value must be entered");
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) throws IllegalPropertyException {
		if (city != null || city.length() > 0)
			this.city = city;
		else
			throw new IllegalPropertyException("A city value must be entered");
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) throws IllegalPropertyException {
		if (state != null || state.length() > 0)
			this.state = state;
		else
			throw new IllegalPropertyException("A state value must be entered");
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) throws IllegalPropertyException {
		if (zip != null || zip.length() > 0)
			this.zip = zip;
		else
			throw new IllegalPropertyException("A zipcode value must be entered");
	}
	
	public double getValue()  {
		return value;
	}
	public void setValue(double value) throws IllegalPropertyException {
		if (value > 0)
			this.value = value;
		else
			throw new IllegalPropertyException("The value entered must be greater than 0.");	
	}
	
	public double getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(double squareFeet) throws IllegalPropertyException {
		if (squareFeet > 0)
			this.squareFeet = squareFeet;
		else
			throw new IllegalPropertyException("The square feet entered must be greater than 0.");
	}
	
	public double getNumberOfBaths() {
		return numberOfBaths;
	}
	public void setNumberOfBaths(double numberOfBaths) throws IllegalPropertyException {
		if (numberOfBaths > 0)
			this.numberOfBaths = numberOfBaths;
		else
			throw new IllegalPropertyException("The number of bathrooms entered must be greater than 0.");
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) throws IllegalPropertyException {
		if (numberOfBedrooms > 0)
			this.numberOfBedrooms = numberOfBedrooms;
		else
			throw new IllegalPropertyException("The number of bedrooms entered must be greater than 0.");
	}
	
	@Override
	public String toString( ) {
		return getClass() + " [propertyID=" + propertyID + ", "
				+ "address=" + address + ", "
				+ "city=" + city + ", "
				+ "state=" + state + ", "
				+ "zip=" + zip + ", "
				+ "value=" + value + ", "
				+ "squareFeet=" + squareFeet + ", "
				+ "numberOfBaths=" + numberOfBaths + ", "
				+ "numberOfBedrooms=" + numberOfBedrooms + "]";
	}
	
	@Override
	public int compareTo(Property objToComp) {
		return (int) (this.value - objToComp.value);
	}

}
