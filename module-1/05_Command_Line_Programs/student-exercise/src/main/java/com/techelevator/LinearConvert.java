package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		System.out.print("Please enter the length: ");
		
		Scanner in = new Scanner (System.in);
		
		int lengthInput = in.nextInt();
		in.nextLine();
		
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		
		String lengthMetersOrFeet = in.nextLine();
				
		if (lengthMetersOrFeet.equals("m")) {
			int lengthFeet = (int) (lengthInput * 3.2808399);
			System.out.println(lengthInput + "m is " + lengthFeet + "f.");
		}
		else if (lengthMetersOrFeet.equals("f")) {
			int lengthMeters = (int) (lengthInput * 0.3048);
			System.out.println(lengthInput + "f is " + lengthMeters + "m.");
		}
	}

}
