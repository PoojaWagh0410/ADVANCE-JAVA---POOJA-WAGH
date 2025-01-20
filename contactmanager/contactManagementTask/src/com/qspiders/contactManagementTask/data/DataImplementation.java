package com.qspiders.contactManagementTask.data;

import java.util.ArrayList;
import java.util.List;

import com.qspiders.contactManagementTask.entity.Contact;

public class DataImplementation implements Data{
	
	private List<Contact> contacts = new ArrayList<Contact>();

	@Override
	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact added sucessfully...");
		
	}

	@Override
	public void showContacts() {
		System.out.println("Your contact list is shown below : ");
		System.out.println(contacts);
	}
	
}
