package com.qsipders.serialization;

import java.io.IOException;

public class MessangerDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Messanger messanger = new Messanger();		
		
		messanger.send("HII, How are You?");
		
		System.out.println(messanger.receive());
	}
}
