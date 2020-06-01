package com.techelevator;

public class TriangleKata {

	public String classify(int side1, int side2, int side3) {
		
		
		if (!isValidTriangle(side1, side2, side3)) {
			return "invalid";
		}
	
		if ((side1 == side2 && side1 != side3) ||
				(side1 == side3 && side1 != side2) ||
				(side2 == side3 && side1 != side2)) {
			return "isosceles";
		}
		
		if( side1 == side2 && side1 == side3) {
			return "equilateral";
		}
		
		
		return "scalene";
	}
	
	private boolean isValidTriangle(int side1, int side2, int side3) {
		int sumOf1and2 = side1 + side2;
		int sumOf2and3 = side2 + side3;
		int sumOf1and3 = side1 + side3;
		
		if (sumOf1and2 <= side3 ||
				sumOf2and3 <= side1 ||
				sumOf1and3 <= side2) {
			return false;
		}
		return true;
	}
	
}
