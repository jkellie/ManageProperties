package edu.seminolestate.properties;

public abstract class Property {
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
		this.setCity(city); //need to do get and set on this
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
