package com.pteraforce.compare2string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pteraforce.compare2string.comparators.FloatComparator;

public class FloatComparatorTest {
	FloatComparator comparator = new FloatComparator();
	
	@Test
	public void testEqual() {
		assertEquals(0, comparator.compare("0.50", "0.50"));
	}
	
	@Test
	public void testGreater() {
		assertEquals(1, comparator.compare("10.00", "9.99"));
	}
	
	@Test
	public void testLess() {
		assertEquals(-1, comparator.compare("102.12", "303.30"));
	}
}