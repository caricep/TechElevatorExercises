package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please enter the temperature: ");
	
		int tempInput = in.nextInt();
		in.nextLine();
		
		System.out.print("Is the temperature in Celsius (0), or Fahrenheit (1)? ");
		
		String tempFC = in.nextLine();
		
		
	//	System.out.printf( "%sF, is %sC.", tempFahrenheit, tempCelsius);
		
	}

}
