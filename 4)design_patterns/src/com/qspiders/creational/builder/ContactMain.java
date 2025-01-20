package com.qspiders.creational.builder;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact1 = new ContactBuilder().setFirstName("Ramesh").setMobile(9876543210l).setWork(9988776655l)
				.build();
		System.out.println(contact1);
		
		Contact contact2 = new ContactBuilder().setFirstName("Pooja").setLandline(989).setEmail("Pooja@gmai8l.com").setGender("Female").setDob("04/11/2000").build();
		System.out.println(contact2);
	}
}
