package com.qspiders.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStramRead {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			int b = -1;
			int sum=0;
			while((b = fileInputStream.read()) != -1) {
				
				System.out.println(b);
			}
		}else {
			System.out.println("File does not exists");
		}
	}
}
