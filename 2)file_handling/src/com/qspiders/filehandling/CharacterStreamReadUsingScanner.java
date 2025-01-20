package com.qspiders.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterStreamReadUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		
		if(file.exists()) {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		else {
			System.out.println("File does not exists");
		}		
	}
}
