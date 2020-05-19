package com.techelevator;

import java.util.Scanner;

public class DecimalToBinaryReview {

	public static void main(String[] args) {
		
		//Take user input and give binary form for these numbers:  12 512 33

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter decimal numbers >>>");
		
		String inputValue = userInput.nextLine();
		
		String[] decimalNumbers = inputValue.split(" ");
		
		for (int i = 0; i < decimalNumbers.length; i++) {
			
			int decimalNumber = Integer.parseInt(inputValue);
		
			String binaryNumber =  "";
		
			while (decimalNumber > 0 ) {
				binaryNumber += String.valueOf(decimalNumber % 2);
				decimalNumber = decimalNumber / 2;
			}
		
			System.out.println(binaryNumber);
		}
	}

}
