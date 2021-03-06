package com.techelevator;

import org.junit.*;

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
	
	@Test
	public void result_is_fizz_when_number_is_divisible_by_3() {
		String result = kataFizzBuzz.fizzBuzz(3);
		
		Assert.assertEquals("Fizz", result);
	}
	
	@Test
	public void result_is_buzz_when_number_is_divisible_by_5() {
		String result = kataFizzBuzz.fizzBuzz(5);
		
		Assert.assertEquals("Buzz", result);
	}
	
	@Test
	public void result_is_fizzbuzz_when_number_is_divisible_by_3_and_5() {
		String result = kataFizzBuzz.fizzBuzz(15);
		
		Assert.assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void result_is_22_when_number_is_22() {
		String result = kataFizzBuzz.fizzBuzz(22);
		
		Assert.assertEquals("22", result);
	}
	
	@Test
	public void result_is_empty_string_when_number_is_0() {
		String result = kataFizzBuzz.fizzBuzz(0);
		
		Assert.assertEquals("", result);
	}
	
	@Test
	public void result_is_fizz_when_number_contains_3() {
		String result = kataFizzBuzz.fizzBuzz(3);
		String result13 = kataFizzBuzz.fizzBuzz(13);

		
		Assert.assertEquals("Fizz", result);
		Assert.assertEquals("Fizz", result13);
	}
	
	@Test
	public void result_is_buzz_when_number_contains_5() {
		String result = kataFizzBuzz.fizzBuzz(5);
		String result51 = kataFizzBuzz.fizzBuzz(51);

		
		Assert.assertEquals("Buzz", result);
		Assert.assertEquals("Buzz", result51);
	}
	
	@Test
	public void result_is_fizzbuzz_when_number_contains_3_and_5() {
		String result35 = kataFizzBuzz.fizzBuzz(35);
		String result53 = kataFizzBuzz.fizzBuzz(53);

		
		Assert.assertEquals("FizzBuzz", result35);
		Assert.assertEquals("FizzBuzz", result53);
	}
	
}
