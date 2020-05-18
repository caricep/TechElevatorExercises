package com.techelevator;

import java.util.Scanner;

/*
Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
 .
 */

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		
		for ( ; in.hasNextInt() ; ) {
			
		String[] userInput = in.nextLine().split(" ");
		
		int[] decimalValue = new int[userInput.length];
			
			for (int i = 0; i < userInput.length; i++) {
				decimalValue[i] = Integer.parseInt(userInput[i]);
				
		
			System.out.printf("\n%s in binary is %s ", decimalValue[i], Integer.toBinaryString(decimalValue[i]));
			
			}
		}
	}

}
