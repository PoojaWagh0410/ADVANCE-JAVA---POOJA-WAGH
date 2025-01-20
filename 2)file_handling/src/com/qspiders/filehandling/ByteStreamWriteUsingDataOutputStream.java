package com.qspiders.filehandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWriteUsingDataOutputStream {

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
		DataOutputStream dataOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(file);
			dataOutputStream = new DataOutputStream(fileOutputStream);
			dataOutputStream.writeInt(2000);
			System.out.println("Data is written to a file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}finally {
			try {
				fileOutputStream.close();
				dataOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
