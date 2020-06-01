package com.techelevator;

public class TriangleKata {

	public String classify(int side1, int side2, int side3) {
		
		if (side1 + side2 <= side3 ||
				side2 + side3 <= side1 ||
				side1 + side3 <= side2) {
			return "invalid";
		}
	
		if (side1 == side2 && side1 != side3) {
			return "isosceles";
		}
		
		if (side1 == side3 && side1 != side2) {
			return "isosceles";
		}
	
		
		
		if( side1 == side2 && side1 == side3) {
			return "equilateral";
		}
		
		
		return null;
	}
	
}
