package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int number) {
		
		String numberString = Integer.toString(number);
		
		if (number < 1) {
			return "";
		}
		
		if (number % 3 == 0 && number % 5 == 0 ||
				numberString.contains("3") && numberString.contains("5")) {
			return "FizzBuzz";
		}
		
		if (number % 5 == 0 || numberString.contains("5")) {
			return "Buzz";
		}
		
		if (number % 3 == 0 || numberString.contains("3")) {
			return "Fizz";
		}
		
		if (number >= 1 || number <= 100) {
			return "" + number + "";
		}
		
		
		return null;
	}
	
}
