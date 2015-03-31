package com.pteraforce.compare2string.test;

import static org.junit.Assert.*;

import com.pteraforce.compare2string.comparators.CurrencyComparator;

import org.junit.Test;

public class CurrencyComparatorTest {
	CurrencyComparator comparator = new CurrencyComparator();
	
	@Test
	public void testEqual() {
		assertEquals(0, comparator.compare("$1.99", "$1.99"));
	}
	
	@Test
	public void testGreater() {
		assertEquals(1, comparator.compare("$159.99", "$16.99"));
	}
	
	@Test
	public void testLess() {
		assertEquals(-1, comparator.compare("$1234.56", "$2222.00"));
	}
}