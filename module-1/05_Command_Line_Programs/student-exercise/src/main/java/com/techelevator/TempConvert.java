package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		// Fahrenheit to Celsius conversion:  Tc = (Tf - 32) / 1.8
		// Celsius to Fahrenheit conversion:  Tf = Tc * 1.8 + 32
	
		System.out.print("Please enter the temperature: ");
		
		Scanner in = new Scanner (System.in);
		
		int tempInput = in.nextInt();
		in.nextLine();
		
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		
		String tempFC = in.nextLine();
				
		if (tempFC.equals("C")) {
			int tempFahrenheit = (int) (tempInput * 1.8 + 32);
			System.out.println(tempInput + "C is " + tempFahrenheit + "F.");
		}
		else if (tempFC.equals("F")) {
			int tempCelcius = (int) ((tempInput - 32) / 1.8);
			System.out.println(tempInput + "F is " + tempCelcius + "C.");
		}
			
	
		
	}

}
