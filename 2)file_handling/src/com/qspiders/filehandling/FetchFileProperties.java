package com.qspiders.filehandling;

import java.io.File;

public class FetchFileProperties {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo.txt");

		if (file.exists()) {
			//This sets the file on Read only mode
			//file.setReadOnly();
			
			// 1) Fetch the exact path of the file
			System.out.println(file.getAbsolutePath());

			// 2) Fetch the file with exetention
			System.out.println(file.getName());

			// 3)Fetch the length of characters present inside file
			System.out.println(file.length());

			// 4)Check whether the file is executable or not
			if (file.canExecute()) {
				System.out.println("File is executable");
			} else {
				System.out.println("File is not executable");
			}

			// 5)Check whether the file is writable or not
			if (file.canWrite()) {
				System.out.println("File is Writable");
			} else {
				System.out.println("File is not Writable");
			}

			// 6)Check whether the file is Readable or not
			if (file.canRead()) {
				System.out.println("File is Readable");
			} else {
				System.out.println("File is not Readable");
			}

		} else {
			System.out.println("File does not exists");
		}
	}
}
