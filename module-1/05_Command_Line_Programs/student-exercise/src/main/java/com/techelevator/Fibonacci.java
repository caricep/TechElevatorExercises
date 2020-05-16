package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

        System.out.print("Please enter the Fibonacci number: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int  fibonacciNumberZeroOrOne = Integer.parseInt(scanner.nextLine());
        	if (fibonacciNumberZeroOrOne == 0)
        System.out.println(fibonacciNumberZeroOrOne);
        	else if (fibonacciNumberZeroOrOne == 1)
        	System.out.println("0 " + fibonacciNumberZeroOrOne);
  
	}
        public int fibonacciNumberSpecial(int[] nums) {
        	int arrayFibonacciSpecial = 0;
        	
        	for (int i = 0; i < nums.length; i++)
        		if (nums[0] == 0) {
        			System.out.println(arrayFibonacciSpecial);
        	}
        	
    		
		return 0;
		
		
	}

}
