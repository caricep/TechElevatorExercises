package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		File file = new File("alices_adventures_in_wonderland.txt");
	
		int wordCount = 0;
		int sentenceCount = 0;
		
		try ( Scanner fileScanner = new Scanner( file ) ) {
			
			while ( fileScanner.hasNextLine() ) {
				
				String nextLineFromFile = fileScanner.nextLine();
				String singleSpace = nextLineFromFile.replaceAll("\\s+", " ");
				String[] arrayOfWords = singleSpace.split(" ");
					
			for ( String words : arrayOfWords) {
				
				if (words.equals("")) {
					wordCount--;
				}
				
				if (words.contains(".") || words.contains("?") || words.contains("!")) {
					sentenceCount++;
				}
				
			} 	wordCount += arrayOfWords.length;
				
				System.out.println( "Word Count: " + wordCount);
				System.out.println( "Sentence Count: " + sentenceCount);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		

		
	}

}
