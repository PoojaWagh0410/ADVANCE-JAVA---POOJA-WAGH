package com.qspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
			
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		boolean created = file.createNewFile();
		if(created)
			System.out.println("FIle is Created!");
		else
			System.out.println("File already exists!");
	}
}
