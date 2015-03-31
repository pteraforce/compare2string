package com.pteraforce.compare2string.comparators;

import java.util.Comparator;

/**
 * Compares two ints that are represented in string form. This comparator
 * is needed because the default sorting algorithm will sort these values
 * alphabetically, not numerically. This means it will sort one digit at a
 * time.
 * 
 * For example, the numbers 11, 2, 105, 3000, and 404 would be sorted as
 * seen below by default:
 * <ol>
 * <li>105</li>
 * <li>11</li>
 * <li>2</li>
 * <li>3000</li>
 * <li>404</li>
 * </ol>
 * 
 * Using this comparator, they will be sorted as:
 * <ol>
 * <li>2</li>
 * <li>11</li>
 * <li>105</li>
 * <li>404</li>
 * <li>3000</li>
 * </ol>
 * 
 * @author Tyler Smith
 * @version 1.0.0
 */
public class IntComparator implements Comparator<String> {
	/**
	 * Return a comparison between two ints. This method returns 1 if the
	 * first number is greater than, -1 if it is less than, and 0 if it is 
	 * equal to the second number.
	 * 
	 * @param arg0 The first number.
	 * @param arg1 The second number.
	 * @return -1, 0, or 1 depending on if the first int is less than, 
	 * equal to, or greater than the second int, respectively.
	 */
	@Override
	public int compare(String arg0, String arg1) {
		int int0 = 0;
		int int1 = 0;
		boolean int0Valid = true;
		boolean int1Valid = true;
		
		// attempt to parse the ints
		// if the parsing fails, mark that int as invalid
		try {
			int0 = Integer.parseInt(arg0);
		} catch (NumberFormatException e) {
			int0Valid = false;
		}
		
		try {
			int1 = Integer.parseInt(arg1);
		} catch (NumberFormatException e) {
			int1Valid = false;
		}
		
		// if only one int is valid, consider it to be the larger number
		// if neither of the int are valid, consider them equal
		if (int0Valid && !int1Valid) {
			return 1;
		} else if (!int0Valid && int1Valid) {
			return -1;
		} else if (!int0Valid && !int1Valid) {
			return 0;
		}

		// both ints are valid, compare
		if (int0 > int1) { 
			return 1;
		} else if (int0 < int1) {
			return -1;
		} else {
			return 0;
		}
	}
}