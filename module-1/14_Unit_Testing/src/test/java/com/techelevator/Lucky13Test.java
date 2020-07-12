package com.techelevator;

import org.junit.*;

public class Lucky13Test {

	private Lucky13 lucky13;
	
	@Before
	public void setup() {
		lucky13 = new Lucky13();
	}	
	
	@Test
	public void array_does_not_contain_1s_or_3s_returns_true() {
		int[] numbers = {5, 6, 8, 2};
		boolean lucky = lucky13.getLucky(numbers);
		
		Assert.assertTrue(lucky);
		
	}
	
	@Test
	public void array_does_not_contain_1s_but_contains_3s_returns_false() {
		int[] numbers = {5, 6, 8, 3, 2};
		boolean lucky = lucky13.getLucky(numbers);
		
		Assert.assertFalse(lucky);
		
	}
	
	@Test
	public void array_does_not_contain_3s_but_contains_1s_returns_false() {
		int[] numbers = {5, 6, 8, 1, 1};
		boolean lucky = lucky13.getLucky(numbers);
		
		Assert.assertFalse(lucky);
		
	}
	
}
