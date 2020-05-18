package com.techelevator;

import java.util.Scanner;

/*
Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
 
 */

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		
		for ( ; in.hasNextInt() ; ) {
			
			int decimalValue = in.nextInt();
			int divisionResult;
			
			while (decimalValue > 0) {
				if (decimalValue % 2 == 0) {
					divisionResult = (decimalValue / 2);
					System.out.print(0);
			}
				else if (decimalValue % 2 == 1) {
					divisionResult = (decimalValue / 2);
					System.out.print(1);
			
			
				divisionResult = decimalValue % 2;
			
				
			}
			
		
			
		//	System.out.printf("\n%s in binary is %s ", decimalValue, binaryNumber);
			}
			}
	}

}
