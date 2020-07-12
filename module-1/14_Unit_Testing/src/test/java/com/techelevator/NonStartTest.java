package com.techelevator;

import org.junit.*;

public class NonStartTest {

private NonStart nonStart;
	
	@Before
	public void setup() {
		nonStart = new NonStart();
	}	
	
	@Test
	public void return_strings_with_first_chars_omitted() {
		String removeFirstChars = nonStart.getPartialString("Hello", "There");
		
		Assert.assertEquals("ellohere", removeFirstChars);
	}
	
	@Test
	public void return_one_string_partially_when_other_string_is_length_0() {
		String removeFirstCharA = nonStart.getPartialString("Cake", "");
		String removeFirstCharB = nonStart.getPartialString("", "Banana");
		
		Assert.assertEquals("ake", removeFirstCharA);
		Assert.assertEquals("anana", removeFirstCharB);
	}
	
	
}
