package com.qspiders.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamRead {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		
		String data = "";
		
		if(file.exists()) {
			FileReader fileReader = new FileReader(file);
			int ascii = -1;
			while((ascii = fileReader.read()) != -1) {
				data += (char)ascii;
			}
			System.out.println(data);
			fileReader.close();
		}else {
			System.out.println("File does not exists");
		}
	}
}
