package com.qspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo.txt");
		boolean created = file.createNewFile();
		if (created)
			System.out.println("FIle is Created!");
		else
			System.out.println("File already exists!");
	}
}
