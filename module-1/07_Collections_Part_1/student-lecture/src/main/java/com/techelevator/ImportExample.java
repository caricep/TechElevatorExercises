package com.techelevator;

import java.util.Scanner;
import com.techelevator.data.NumberCruncher;

// import java.util.*;	<--	it's possible to import entire class at once, but may cause problems. only use in development if ever

public class ImportExample {
	
	public static void main(String[] args) {
		
		Scanner in = new java.util.Scanner(java.lang.System.in);   // Previously (before moving to top in import: java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
		
		System.out.println("Pick a whole number?");   // java.lang.System.out.println("Pick a whole number?");
		
		String userChoice = in.nextLine();		// java.lang.String userChoice = in.nextLine();
		int number = Integer.parseInt(userChoice);	// int number = java.lang.Integer.parseInt(userChoice);
		
		NumberCruncher numberCruncher = new NumberCruncher();   // Import of NumberCruncher moved to top, previously: com.techelevator.data.NumberCruncher numberCruncher = new com.techelevator.data.NumberCruncher();
		Integer newNumber = numberCruncher.multiplyNumberBy10(number);	// java.lang.Integer newNumber = numberCruncher.multiplyNumberBy10(number);
		
		System.out.println("Your number multiplied by 10 is " + newNumber);	// java.lang.System.out.println("Your number multiplied by 10 is " + newNumber);

	}

}
