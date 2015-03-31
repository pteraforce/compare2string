package com.pteraforce.compare2string.comparators;

import java.util.Comparator;

/**
 * Compares two prices to each other. Currently, this class only works for
 * dollars, but more currencies are on the way.
 * 
 * @author Tyler Smith
 * @version 1.0.0
 */
public class CurrencyComparator implements Comparator<String> {
	/**
	 * Return a comparison between two prices. This method returns 1 if the
	 * first price is greater than, -1 if it is less than, and 0 if it is 
	 * equal to the second price.
	 * 
	 * @param arg0 The first price.
	 * @param arg1 The second price.
	 * @return -1, 0, or 1 depending on if the first price is less than, 
	 * equal to, or greater than the second price, respectively.
	 */
	@Override
	public int compare(String arg0, String arg1) {
		arg0 = arg0.replace("$", "");
		arg1 = arg1.replace("$", "");
		
		return (new FloatComparator()).compare(arg0, arg1);
	}
}