package com.example.uniovi;

import java.util.ArrayList;

public class NaturalNumber {

	private int value;
	
	/**
	 * Creates a natural number.
	 * 
	 * @param number
	 *             the number.
	 */
	public NaturalNumber(int number) throws IllegalArgumentException {

		value = number;
	}
		
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof NaturalNumber)) return false;
		
		return value == ((NaturalNumber)other).value;
	}
	
	
	/**
	 * Gets the divisors of the number, including 1 and the number itself.
	 * @return
	 *             a list with all the divisors.
	 */
	public ArrayList<NaturalNumber> getDivisors() {

		ArrayList<NaturalNumber> divisors = new ArrayList<NaturalNumber>();
		// TODO: Not implemented
		return divisors;
	}
}
