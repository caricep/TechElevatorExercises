package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the file path>>>>");
		String path = userInput.nextLine();
		
		File originalFile = new File(path);
		
		if (!originalFile.exists()) {
			System.out.println(originalFile.getAbsolutePath() + " does not exist.");
		} else {
			
		System.out.println();
		
		System.out.print("Please enter the word you want to replace>>> ");
		String wordToReplace = userInput.nextLine();
		System.out.print("What word would you like to replace that with? ");
		String replacementWord = userInput.nextLine();
			
			try { 
			Scanner fileScanner = new Scanner(originalFile); 
			File newFile = new File("copy_of_alices_adventures_file.txt");
			PrintWriter printWriter = new PrintWriter(newFile);
			
				while (fileScanner.hasNextLine()) {
					String nextLineFromFile = fileScanner.nextLine();
				
				nextLineFromFile = nextLineFromFile.replaceAll(wordToReplace, replacementWord);
				printWriter.println(nextLineFromFile);
				}	 
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
