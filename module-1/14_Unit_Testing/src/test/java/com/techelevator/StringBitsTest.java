package com.techelevator;

import org.junit.*;

public class StringBitsTest {

	private StringBits stringBits;
	
	@Before
	public void setup() {
		stringBits = new StringBits();
	}
	
	@Test
	public void string_is_empty_returns_blank() {
		String everyOtherLetter = stringBits.getBits("");
		
		Assert.assertEquals("", everyOtherLetter);
	}
	
	@Test
	public void string_returns_every_other_letter_starting_with_first_char() {
		String everyOtherLetter = stringBits.getBits("Pineapple");
		
		Assert.assertEquals("Pnape", everyOtherLetter);
	}
	
	
}
