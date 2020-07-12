package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		System.out.print("Please enter the amount of the bill: ");
		Scanner in = new Scanner(System.in);
		double userInput = in.nextDouble();
		System.out.print("Please enter the amount tendered: ");
		double tenderedAmount = in.nextDouble();
		double changeRequired = tenderedAmount - userInput;
		System.out.printf("The change required is %.2f",changeRequired);
		
		
	}

}
