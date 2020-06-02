package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	private KataFizzBuzz kataFizzBuzz;
	
	@Before
	public void setup() {
		kataFizzBuzz = new KataFizzBuzz();
	}
	
	@Test
	public void result_is_1_when_number_is_1() {
		String result = kataFizzBuzz.fizzBuzz(1);
		
		Assert.assertEquals("1", result);
	}
	
}
