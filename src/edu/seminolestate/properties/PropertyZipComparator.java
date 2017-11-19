package edu.seminolestate.properties;

//Author: Jason Kellie - 11/19/17

import java.util.Comparator;

public class PropertyZipComparator implements Comparator<Property> {

	@Override
	public int compare(Property p1, Property p2) {
		return p1.getZip().compareToIgnoreCase(p2.getZip());
	}
}
