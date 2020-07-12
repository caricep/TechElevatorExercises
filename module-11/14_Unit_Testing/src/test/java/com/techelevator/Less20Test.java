package com.techelevator;

import org.junit.*;

public class Less20Test {

private Less20 less20;
	
	@Before
	public void setup() {
		less20 = new Less20();
	}	
	
	
	@Test
	public void multiple_of_20_is_false() {
		boolean multipleNumber = less20.isLessThanMultipleOf20(10);
		
		Assert.assertFalse(multipleNumber);
	}
	
	@Test
	public void multiple_of_19_is_true() {
		boolean multipleNumber = less20.isLessThanMultipleOf20(19);
		
		Assert.assertTrue(multipleNumber);
	}
	
	@Test
	public void multiple_of_18_is_true() {
		boolean multipleNumber = less20.isLessThanMultipleOf20(18);
		
		Assert.assertTrue(multipleNumber);
	}
	
	@Test
	public void multiple_is_0_is_false() {
		boolean multipleNumber = less20.isLessThanMultipleOf20(0);
		
		Assert.assertFalse(multipleNumber);
	}
	
	@Test
	public void negative_multiple_of_19_is_false() {
		boolean multipleNumber = less20.isLessThanMultipleOf20(-19);
		
		Assert.assertFalse(multipleNumber);
	}
	
	@Test
	public void negative_multiple_of_18_is_false() {
		boolean multipleNumber = less20.isLessThanMultipleOf20(-18);
		
		Assert.assertFalse(multipleNumber);
	}
	
}
