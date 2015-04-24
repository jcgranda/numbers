package com.example.uniovi;

import junit.framework.TestCase;

public class NaturalNumberTest extends TestCase {
	
	private static final int[] numbers = { 0, 1, 2, 6, 18, 60, 109 };

	
	/**
	 * Testing of equals().
	 */
	public void testEquals() {
		
		for (int i = 0; i < numbers.length; i++) {
			assertTrue(new NaturalNumber(numbers[i]).equals(new NaturalNumber(numbers[i])));
		}
	}
	
	
	/**
	 * Testing of equals().
	 */
	public void testNotEquals() {
		
		for (int i = 0; i < numbers.length; i++) {
			assertFalse(new NaturalNumber(numbers[i]).equals(new NaturalNumber(numbers[(i+1)%numbers.length])));
		}
	}
	
	
	/**
	 * Testing of getDivisors().
	 */
	public void testGetDivisors() {
		
		// TODO: Not implemented
		assertTrue(true);
	}
}
