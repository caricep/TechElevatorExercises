package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
	
		System.out.print("Please enter the temperature: ");
		Scanner in = new Scanner (System.in);
		
		int tempInput = in.nextInt();
		in.nextLine();
		
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		
		String[] tempFC = {"C", "F"};
		String userInput = in.nextLine();
		int tempFahrenheit = Integer.parseInt(userInput);
		int tempCelsius = Integer.parseInt(userInput);
		
		System.out.printf( "%sF, is %sC.", doConversion(tempInput, userInput)); }
		
		public static int doConversion(int tempInput, String userInput) {
			
			double tempFahrenheit = (int) tempInput * 1.8 + 32; 
			double tempCelsius = (int) (tempInput - 32) / 1.8;
			
			if (userInput == "F") {
				return (int) tempFahrenheit;
			} else if (userInput == "C") {
				return (int) tempCelsius;
			}
			
			return 0;
		
		
		
	}

}
