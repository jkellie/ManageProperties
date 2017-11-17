package edu.seminolestate.properties;

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
			double squareFeet, double numberOfBaths, int numberOfBedrooms) {
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
	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public double getNumberOfBaths() {
		return numberOfBaths;
	}
	public void setNumberOfBaths(double numberOfBaths) {
		this.numberOfBaths = numberOfBaths;
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	
	public String toString( ) {
		return "change this";
	}

}
