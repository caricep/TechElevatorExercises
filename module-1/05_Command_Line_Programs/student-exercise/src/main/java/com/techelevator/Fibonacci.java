package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the Fibonacci number: ");
			
        int  fibonacciNumber = Integer.parseInt(scanner.nextLine());
        	if (fibonacciNumber == 0) {
        		System.out.println(fibonacciNumber);
        	}
        	else if (fibonacciNumber == 1)
        		System.out.println("0, " + fibonacciNumber);
	
        	int enteredNumber = 0;
        	int i;
        	
        	 {
        		
        		 for (i = 2; i > 1; i++) {
        			 if (fibonacciNumber > 1)	
        			 i++;
        				System.out.print("0, " + "1, " + "1, " + fibonacciNumber);
        		}
        		
        			
        	}
        		
	
	
	
			
        	{
        			
        			}
        	        
        				
        					
        				
  
        			
        
        		
        	
    		
        	}

}
