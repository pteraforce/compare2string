package com.pteraforce.compare2string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pteraforce.compare2string.comparators.IntComparator;

public class IntComparatorTest {
	IntComparator comparator = new IntComparator();
	
	@Test
	public void testEqual() {
		assertEquals(0, comparator.compare("10", "10"));
	}
	
	@Test
	public void testGreater() {
		assertEquals(1, comparator.compare("25", "15"));
	}
	
	@Test
	public void testLess() {
		assertEquals(-1, comparator.compare("9", "10"));
	}
}