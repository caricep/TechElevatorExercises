package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the Fibonacci number: ");
		
		String userInput = in.nextLine();
		int enteredNumber = Integer.parseInt(userInput);
		
		int zeroNum = 0;
		int oneNum = 1;
		
		for (int i = 1; i > 1; i++) {
			
		if (enteredNumber == 0) {
			System.out.printf("Fibonacci sequence for 0 not found.");
		} else if (enteredNumber == 1) {
			System.out.println(zeroNum + ", " + oneNum);
			
			
		}
		
			
		}
		
        
    		
     }

}
