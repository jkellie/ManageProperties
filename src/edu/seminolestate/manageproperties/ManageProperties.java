package edu.seminolestate.manageproperties;

import edu.seminolestate.properties.*;

import java.util.ArrayList;
import java.util.Scanner;

import edu.seminolestate.properties.Property;


public class ManageProperties {
	private static ArrayList<Property> properties = new ArrayList<>();
	
	private static Scanner keyboard = new Scanner(System.in);
	private static final int ADD_HOUSE = 1;
	private static final int ADD_APPARTMENT = 2;
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
			case ADD_APPARTMENT:
				addAppartment();
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
			System.out.println(ADD_APPARTMENT + ". Add an appartment");
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

}
