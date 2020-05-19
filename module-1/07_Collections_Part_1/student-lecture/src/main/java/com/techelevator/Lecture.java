package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> instructors = new ArrayList<String>(); //need to import java.util to eliminate error. can use drop down options

		instructors.add("John");			// instructors.(drop down of methods appears that you can select)
		instructors.add("Steve");	
		instructors.add("Matt");	
		instructors.add("Matty");	
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < instructors.size(); i++) {
			System.out.println(instructors.get(i));
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		 
		instructors.add("John");
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		instructors.add(1, "Rachelle");
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		instructors.remove(5);  //Removes the duplicate "John"
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean isRachelleInList = instructors.contains("Rachelle");  	//will return TRUE
		boolean isJoshInList = instructors.contains("Josh");			// will return FALSE
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] instructorArray = instructors.toArray( new String[ instructors.size() ] );
		
		// Arrays can also be turned into Lists
		List<String> instructorList = Arrays.asList(instructorArray);
		
		
		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		Integer employees = new Integer(25);
		Integer piecesOfCake = new Integer("24");
		
		boolean enoughCake = employees > piecesOfCake;
		
		int num = 10;
		Integer numWrapper = num;
		Integer xyz = 20;
		int xyzAsInt = xyz;
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		Queue<String> tasks = new LinkedList<String>();
		
		tasks.offer("Clean dishes");
		tasks.offer("Sweep floors");
		tasks.offer("Clean dog");
		tasks.offer("Organize room");
		
		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////

		while (tasks.isEmpty() == false) {
			System.out.println("Next task: " + tasks.poll() );
			System.out.println("Remaining tasks: " + tasks.size() );
			
		}
		
		
		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		Stack<String> history = new Stack<String>();
		
		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////

		history.push("www.google.com");
		history.push("stackoverflow.com");
		history.push("techelevator.com");
		history.push("codinghorror.com");
		
		////////////////////
		// POPPING THE STACK
		////////////////////

		while ( !history.isEmpty() ) {
			System.out.println("Last address" + history.pop() );
		}
		
		//More Stack Examples in teacher notes!!!
		
	}
}
