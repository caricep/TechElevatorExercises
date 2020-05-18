package com.techelevator;


public class Lecture {

	public static void main(String[] args) {

		/* Object Instantiation */
		House houseAt443WinstonSt = new House(1800, "443 Winston St", "Cornflower Blue");
	
		House houseTwo = new House(200, "Somewhere", "red");
		//CLASS NOTES: houseAt443WinstonSt and houseTwo are the objects in the examples above
		
		houseAt443WinstonSt.setColor("Orange");  //CLASS NOTES: Changes the color from Cornflower Blue to Orange
		houseTwo.setAddress("123 Street");   //CLASS NOTES: Changes the address for houseTwo
		
		/* Value Type */
		int x = 10;
		
		
		/* Reference Type */
		//EXAMPLE: updating variable in stack updates the object in the heap for all variables 
		int[] numbers = { 10, 20, 30 , 40 };
		int[] numbers2 = numbers;
		numbers2[2] = 500;
		numbers[0] = 128;
	
		
		//Immutable EXAMPLE
		String firstName = "joe";
		firstName.toUpperCase();  //without the below line, assigning it to something, this line is lost
		String firstNameUpperCase = firstName.toUpperCase();  //CLASS NOTES: must assign so that it creates a new object

		//Object Equality EXAMPLES below

		// EXAMPLE 1
		/*if (firstName == other) {
			System.out.println("not ==");
		}
		
		if (firstName.equals(other)) {
			System.out.println(".equals");
		}
		
		// EXAMPLE 2
		String oneMore = firstName;
		if (firstName == oneMore) {
			System.out.println("==");
		}*/

		
		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");
		
		/* The String class gets special treatment in the Java language.  One 
		 * example of this is that there is a literal representation of a 
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		
		String greeting = "Hello, World!";  // creates a new instance of String using a literal
		System.out.println("greeting : "+greeting);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		/* Below are examples of calling various String methods */
		
		System.out.println("***** charAt *****");
		
		String name = "Tech Elevator";
		char first = name.charAt(0);   // 'T'
		char fourth = name.charAt(3);  // 'h'
		System.out.println(name);
		System.out.println(first);
		System.out.println(fourth);
		
		/* length */
		int nameLength = name.length();  //CLASS NOTES: changed from 0 to name.length(); -- NEED Parentheses!!
		System.out.println("The length of the String "  + name + " is " + nameLength);
		
		/* SubString */
		String s = "Tech Elevator";
		String subStringOfs = s.substring(7,9); //CLASS NOTES: added substring
		System.out.println(subStringOfs);
		
		String subStringToEnd = s.substring(5);  //CLASS NOTES added substring
		System.out.println(subStringToEnd);
		
		/* Contains */
		System.out.println("***** contains *****");
		String hello = "Hello World!";
		System.out.println("hello : "+hello);
		boolean containsHello = hello.contains("Hello");
		System.out.println("containsHello : "+containsHello);
		boolean containsBogus = hello.contains("bogus");
		System.out.println("containsBogus : "+containsBogus);
		
		//EXAMPLES referencing the Contains notes above
		int index = hello.indexOf("World"); //check with debugger
		
		//Split example (slide 25)
		String toBeSplit = "We hold these truths to be self-evident";
		String[] splitArray = toBeSplit.split(" ");
		
		//Join example
		String countDown = String.join("--> ", "5", "4", "3", "2", "1");
		
		
		/* Other commonly used methods:
		 * 
		 * endsWith()
		 * startsWith()
		 * indexOf()
		 * lastIndexOf()
		 * replace()
		 * toLowerCase()
		 * toUpperCase()
		 * equals and equalsIgnoreCase()
		 * split()
		 * trim()
		 * String.join()  <-- available only on the String class and not the string object
		 */

		
		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if(hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
		String hello3 = hello1;
		if(hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}
		
		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		
		if(hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
	}
}
