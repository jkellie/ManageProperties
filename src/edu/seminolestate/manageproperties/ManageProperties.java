package edu.seminolestate.manageproperties;

import edu.seminolestate.properties.*;

import java.util.ArrayList;
import java.util.Scanner;


public class ManageProperties {
	private static ArrayList<Property> properties = new ArrayList<>();
	
	private static Scanner keyboard = new Scanner(System.in);
	private static final int ADD_HOUSE = 1;
	private static final int ADD_APARTMENT = 2;
	private static final int DELETE_PROPERTY = 3;
	private static final int LIST_BY_VALUE = 4;
	private static final int LIST_BY_ZIP = 5;
	private static final int EXIT = 6;

	public static void main(String[] args) {
		int choice = 0;
		do {
			choice = menu();
			switch (choice) {
			case ADD_HOUSE:
				addHouse();
				break;
			case ADD_APARTMENT:
				addApartment();
				break;
			case DELETE_PROPERTY:
				deleteProperty();
				break;
			case LIST_BY_VALUE:
				listByValue();
				break;
			case LIST_BY_ZIP:
				listByZip();
			case EXIT:
				System.out.println("Thanks for using Property Pro!");
			}
		} while (choice != EXIT);

	}
	
	public static int menu(){
		int menuChoice = 0;
		String input;
		do {
			System.out.println("Enter your choice: ");
			System.out.println(ADD_HOUSE + ". Add a house");
			System.out.println(ADD_APARTMENT + ". Add an appartment");
			System.out.println(DELETE_PROPERTY + ". Delete a property");
			System.out.println(LIST_BY_VALUE + ". List by value");
			System.out.println(LIST_BY_ZIP + ". List by zipcode");
			System.out.println(EXIT + ". Exit");
			input = keyboard.nextLine();
			try{
				menuChoice = Integer.parseInt(input);
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numeric values for menu choice");
				menuChoice = -1;
			}
			
			if (menuChoice < ADD_HOUSE || menuChoice > EXIT){
				System.out.println("Invalid value. Enter a value between" + ADD_HOUSE
						+ " and " + EXIT);
			}
		} while (menuChoice < ADD_HOUSE || menuChoice > EXIT);
		return menuChoice;
	}
	
	public static void addHouse() {
		int propertyID = getInteger("Enter the property ID: ");
		String address = getString("Enter the property address: ");
		String city = getString("Enter the city: ");
		String state = getString("Enter the state");
		String zip = getString("Enter the zipcode: ");
		double value = getDouble("Enter the property value: ");
		double squareFeet = getDouble("Enter the square feet: ");
		double numberOfBaths = getDouble("How many baths?: ");
		int numberOfBedrooms = getInteger("How many bedrooms?: ");
		double lotSize = getDouble("Enter the lot size: ");
		House house = null;
		try {
			house = new House(propertyID, address, city, state, zip, value, squareFeet,
					numberOfBaths, numberOfBedrooms, lotSize);
			properties.add(house);
		}
		catch (IllegalPropertyException e) {
			System.out.println("Couldn't create the house object but the application will continue.");
			e.printStackTrace();
		}
	}
	
	public static void addApartment() {
		int propertyID = getInteger("Enter the property ID: ");
		String address = getString("Enter the property address: ");
		String city = getString("Enter the city: ");
		String state = getString("Enter the state");
		String zip = getString("Enter the zipcode: ");
		double value = getDouble("Enter the property value: ");
		double squareFeet = getDouble("Enter the square feet: ");
		double numberOfBaths = getDouble("How many baths?: ");
		int numberOfBedrooms = getInteger("How many bedrooms?: ");
		double unitRent = getDouble("Enter the rent for the unit: ");
		Apartment apartment = null;
		try {
			apartment = new Apartment(propertyID, address, city, state, zip, value, squareFeet,
					numberOfBaths, numberOfBedrooms, unitRent);
			properties.add(apartment);
		}
		catch (IllegalPropertyException e) {
			System.out.println("Couldn't create the apartment object but the application will continue.");
			e.printStackTrace();
		}
	}
	
	public static void deleteProperty() {
		if (properties.isEmpty())
			System.out.println("There are no properties to delete");
		else {
			boolean found = false;
			int compare;
			int propertyID = getInteger("Enter the property ID you wish to delete: ");
			for (int i = 0; i < properties.size(); i++) {
				compare = (properties.get(i)).getPropertyID();
				if (compare == propertyID) {
					found = true;
					properties.remove(i);
					System.out.println("Property removed");
				}
			}
			if (found == false)
				System.out.println("Property not found.");
		}
	}

	
	public static  String getString(String prompt) {
		String userValue = null;
		do {
			System.out.println(prompt);
			userValue = keyboard.nextLine();
			if (userValue == null || userValue.length() < 1) {
				System.out.println("You must enter a value.");
			}
		} while (userValue == null || userValue.length() < 1); 
		return userValue;
	}
	
	public static double getDouble(String prompt) {
		String userValue = null;
		double validDouble = 0;
		boolean isValidDouble = false;
		do {
			System.out.println(prompt);
			try {
				userValue = keyboard.nextLine();
				validDouble = Double.parseDouble(userValue);
				if (validDouble > 0) {
					isValidDouble = true;
				}
				else {
					System.out.println("Enter a value > 0.");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Enter only decimal numbers.");
			}
		} while (! isValidDouble);
		return validDouble;
	}
	
	public static int getInteger(String prompt) {
		String userValue = null;
		int validInteger = 0;
		boolean isValidInteger = false;
		do {
			System.out.println(prompt);
			try {
				userValue = keyboard.nextLine();
				validInteger = Integer.parseInt(userValue);
				if (validInteger > 0) {
					isValidInteger = true;
				}
				else {
					System.out.println("Enter a value > 0.");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Only enter numbers.");
			}
		} while (! isValidInteger);
		return validInteger;
	}

}
