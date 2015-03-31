package com.pteraforce.compare2string.comparators;

import java.util.Comparator;

/**
 * Compares two floats that are represented in string form. This comparator
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
public class FloatComparator implements Comparator<String> {
	/**
	 * Return a comparison between two floats. This method returns 1 if the
	 * first number is greater than, -1 if it is less than, and 0 if it is 
	 * equal to the second number.
	 * 
	 * @param arg0 The first number.
	 * @param arg1 The second number.
	 * @return -1, 0, or 1 depending on if the first price is less than, 
	 * equal to, or greater than the second float, respectively.
	 */
	@Override
	public int compare(String arg0, String arg1) {
		float float0 = 0.0f;
		float float1 = 0.0f;
		boolean float0Valid = true;
		boolean float1Valid = true;
		
		// attempt to parse the floats
		// if the parsing fails, mark that float as invalid
		try {
			float0 = Float.parseFloat(arg0);
		} catch (NumberFormatException e) {
			float0Valid = false;
		}
		
		try {
			float1 = Float.parseFloat(arg1);
		} catch (NumberFormatException e) {
			float1Valid = false;
		}
		
		// if only one float is valid, consider it to be the larger number
		// if neither of the floats are valid, consider them equal
		if (float0Valid && !float1Valid) {
			return 1;
		} else if (!float0Valid && float1Valid) {
			return -1;
		} else if (!float0Valid && !float1Valid) {
			return 0;
		}

		// all floats are valid, compare
		if (float0 > float1) { 
			return 1;
		} else if (float0 < float1) {
			return -1;
		} else {
			return 0;
		}
	}
}