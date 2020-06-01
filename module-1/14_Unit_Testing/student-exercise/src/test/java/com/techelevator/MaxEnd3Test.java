package com.techelevator;

import org.junit.*;

public class MaxEnd3Test {

private MaxEnd3 maxEnd3;
	
	@Before
	public void setup() {
		maxEnd3 = new MaxEnd3();
	}
	
	@Test
	public void array_length_3_returns_first_element_as_larger_number_between_first_and_last_elements() {
		int[] numbers = {2, 6, 8};
		
		if (numbers[0] < numbers[2]) {
		int[] newArray = {numbers[2], numbers[2], numbers[2]};
		int[] largerNumberArray = maxEnd3.makeArray(newArray);
		
		Assert.assertArrayEquals(newArray, largerNumberArray);
		}
	}
	
	@Test
	public void array_length_3_returns_last_element_as_larger_number_between_first_and_last_elements() {
		int[] numbers = {8, 6, 2};
		
		if (numbers[0] > numbers[2]) {
		int[] newArray = {numbers[0], numbers[0], numbers[0]};
		int[] largerNumberArray = maxEnd3.makeArray(newArray);
		
		Assert.assertArrayEquals(newArray, largerNumberArray);
		}
	}
	
}
