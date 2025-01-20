package com.qspiders.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWriter {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		
		if(!(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write("POOJA WAGH");
			System.out.println("Data is written to the file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
