package com.techelevator;

import org.junit.*;

public class SameFirstLastTest {

	private SameFirstLast sameFirstLast;
	
	@Before
	public void setup() {
		sameFirstLast = new SameFirstLast();
	}
	
	@Test
	public void array_length_1_or_more_and_first_and_last_element_are_equal_returns_true() {
		int[] numbers = {5, 6, 8, 5};
		boolean arrayLengthOneOrMore = sameFirstLast.isItTheSame(numbers);
		
		Assert.assertTrue(arrayLengthOneOrMore);
	}
	
	@Test
	public void array_length_1_or_more_and_first_and_last_element_are_not_equal_returns_false() {
		int[] numbers = {2, 6, 8, 5};
		boolean arrayLengthOneOrMore = sameFirstLast.isItTheSame(numbers);
		
		Assert.assertFalse(arrayLengthOneOrMore);
	}
	
	@Test
	public void empty_array_returns_false() {
		int[] numbers = {};
		boolean arrayLengthOneOrMore = sameFirstLast.isItTheSame(numbers);
		
		Assert.assertFalse(arrayLengthOneOrMore);
	}
	
}
