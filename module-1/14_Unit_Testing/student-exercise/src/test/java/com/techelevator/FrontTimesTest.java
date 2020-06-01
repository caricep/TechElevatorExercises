package com.techelevator;

import org.junit.*;

public class FrontTimesTest {

	private FrontTimes frontTimes;
	
	@Before
	public void setup() {
		frontTimes = new FrontTimes();
	}	
	
	
	@Test
	public void verify_nine_letter_word_n_equals_2() {
		String frontLetters = frontTimes.generateString("Chocolate", 2);
		 
		Assert.assertEquals("ChoCho", frontLetters);
	}
	
	@Test
	public void verify_nine_letter_word_n_equals_3() {
		String frontLetters = frontTimes.generateString("Chocolate", 3);
		 
		Assert.assertEquals("ChoChoCho", frontLetters);
	}
	
	@Test
	public void verify_three_letter_word_n_equals_3() {
		String frontLetters = frontTimes.generateString("Cat", 3);
		 
		Assert.assertEquals("CatCatCat", frontLetters);
	}
	
	@Test
	public void verify_two_letter_word_n_equals_4() {
		String frontLetters = frontTimes.generateString("To", 4);
		 
		Assert.assertEquals("ToToToTo", frontLetters);
	}
	
}
