package com.qspiders.filehandling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReadUsingDataInputStream {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\SATYAM\\Desktop\\ADVANCE JAVA NOTES\\Demo2.txt");
		
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			DataInputStream dataInputStream = new DataInputStream(fileInputStream);
			
			int res = dataInputStream.readInt();
			System.out.println(res);
			fileInputStream.close();
			dataInputStream.close();
		}else {
			System.out.println("Something went wrong");
		}
	}

}
