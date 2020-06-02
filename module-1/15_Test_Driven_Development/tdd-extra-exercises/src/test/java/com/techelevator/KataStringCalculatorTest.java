package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {

	private KataStringCalculator kataStringCalculator;
	
	@Before
	public void setup() {
		kataStringCalculator = new KataStringCalculator();
	}
	
	@Test
	public void return_0_if_empty_string_provided() {
		int result = kataStringCalculator.add("");
		
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void return_1_if_1_is_provided() {
		int result = kataStringCalculator.add("1");
		
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void return_sum_if_two_numbers_are_provided() {
		int result = kataStringCalculator.add("1,2");
		
		Assert.assertEquals(3, result);
	}
	
}
