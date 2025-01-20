package com.qspiders.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		
		if(!(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(1000);
			System.out.println("Data is written to the file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}


