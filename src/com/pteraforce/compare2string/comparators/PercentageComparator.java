package com.pteraforce.compare2string.comparators;

import java.util.Comparator;

/**
 * Compares two percentages to each other. This function will remove any 
 * existing percent signs and then compare the remaining floats. The floats will
 * be compared by total size using <code>FloatComparator</code>, not the default
 * sorting algorithm for strings. This ensures that the whole number is
 * evaluated, not one digit at a time.
 * 
 * @author Tyler Smith
 * @version 1.0.0
 */
public class PercentageComparator implements Comparator<String> {
	/**
	 * Compare two percentages to each other. This method returns 1 if the
	 * first number is greater than, -1 if it is less than, and 0 if it is 
	 * equal to the second number.
	 * 
	 * @param arg0 The first number.
	 * @param arg1 The second number.
	 * @return -1, 0, or 1 depending on if the first price is less than, 
	 * equal to, or greater than the second percentage, respectively.
	 */
	@Override
	public int compare(String arg0, String arg1) {
		// remove the percent signs from the numbers
		arg0 = arg0.replace("%", "");
		arg1 = arg1.replace("%", "");
		
		return (new FloatComparator().compare(arg0, arg1));
	}
}