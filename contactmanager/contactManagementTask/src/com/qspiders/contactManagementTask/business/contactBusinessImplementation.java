package com.qspiders.contactManagementTask.business;

import java.util.Scanner;

import com.qspiders.contactManagementTask.data.Data;
import com.qspiders.contactManagementTask.data.DataImplementation;
import com.qspiders.contactManagementTask.entity.Contact;

public class contactBusinessImplementation implements ContactBusiness{

	private Data data = new DataImplementation();
	
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public void addContacts() {
		
		System.out.print("Enter your first name : ");
		String firstName = scanner.next();
		
		System.out.print("Enter your last name : ");
		String lastName = scanner.next();
		
		System.out.print("Enter your mobile number : ");
		long mobile = scanner.nextLong();
		
		System.out.print("Enter your Email : ");
		String email = scanner.next();
		
		System.out.print("Enter your Address : ");
		String address = scanner.next();
		
		Contact contact = new Contact(lastName, lastName, mobile, email, address);
		data.addContact(contact);
				
	}

	@Override
	public void viewContacts() {
		data.showContacts();
	}

}
