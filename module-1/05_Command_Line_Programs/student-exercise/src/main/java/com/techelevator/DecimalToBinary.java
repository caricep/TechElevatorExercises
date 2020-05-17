package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		
		for ( ; in.hasNextInt() ; ) {
			
			int decimalValue = in.nextInt();
			
			double binaryValue = (int) decimalValue * 0.378;
			
			
			System.out.printf("\n%s in binary is %s ", decimalValue, (int) binaryValue);
		}
	}

}
