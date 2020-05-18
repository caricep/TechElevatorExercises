package com.techelevator;

import java.util.Scanner;
//..
public class Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the Fibonacci number: ");

		int enteredNumber = in.nextInt();
		in.nextLine();
		
		int firstNumber = 0;
		int secondNumber = 1;
		int fibonacciSum = 0;
		
		System.out.print(firstNumber + ", ");
		
		for ( int nextNumber = 1; nextNumber <= enteredNumber; ) {
			
			System.out.print(nextNumber + ", " + "");
			
			fibonacciSum = firstNumber;
			firstNumber = nextNumber;
			nextNumber = nextNumber + fibonacciSum;
		}
				
		
	}
}