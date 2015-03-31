package com.pteraforce.compare2string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pteraforce.compare2string.comparators.PercentageComparator;

public class PercentageComparatorTest {
	PercentageComparator comparator = new PercentageComparator();
	
	@Test
	public void testEqual() {
		assertEquals(0, comparator.compare("15%", "15%"));
	}
	
	@Test
	public void testGreater() {
		assertEquals(1, comparator.compare("15%", "2%"));
	}
	
	@Test
	public void testLess() {
		assertEquals(-1, comparator.compare("9%", "55%"));
	}
}