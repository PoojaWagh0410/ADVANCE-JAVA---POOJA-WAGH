package com.qspiders.filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo.txt");
		if(file.exists()) {
			boolean deleted = file.delete();
			
			if(deleted)
				System.out.println("File is Deleted!");
			else
				System.out.println("Something went wrong!");
		}
		else {
			System.out.println("File does not exists");
		}
	}
}
