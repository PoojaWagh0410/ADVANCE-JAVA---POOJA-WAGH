package com.qspiders.contactmanager.business;

import java.util.Scanner;
import com.qspiders.contactmanager.data.Data;
import com.qspiders.contactmanager.data.DataImplementation;
import com.qspiders.contactmanager.entity.Contact;

public class BusinessImplementation implements Business {

	private Scanner scanner = new Scanner(System.in);

	private int id;

	private Data data = new DataImplementation();

	@Override
	public void addContact() {
		System.out.print("Enter first name : ");
		String firstName = scanner.next();

		System.out.print("Enter last name : ");
		String lastName = scanner.next();

		System.out.print("Enter Mobile number : ");
		long mobile = scanner.nextLong();

		System.out.print("Enter work number : ");
		long work = scanner.nextLong();

		System.out.print("Enter Email id : ");
		String email = scanner.next();

		Contact contact = new Contact(id(), firstName, lastName, mobile, work, email);

		data.addContact(contact);

		Contact[] contacts = data.findAllContacts();

		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
	}

	@Override
	public void deleteContact() {
		System.out.println("Enter contact id");
		int id = scanner.nextInt();
		data.deleteContact(id);

		Contact[] contacts = data.findAllContacts();

		if (contacts.length > 0) {
			for (int i = 0; i < contacts.length; i++) {
				System.out.println(contacts[i]);
			}
		} else {
			System.out.println("Contact not found...");
		}
	}

	@Override
	public void updateContact() {

		System.out.print("Enter contact id : ");
		int id = scanner.nextInt();

		Contact contact = data.findContactById(id);

		if (contact != null) {
			System.out.print("Enter first name : ");
			String firstName = scanner.next();
			contact.setFirstName(firstName);

			System.out.print("Enter last name : ");
			String lastName = scanner.next();
			contact.setLastName(lastName);

			System.out.print("Enter Mobile number : ");
			long mobile = scanner.nextLong();
			contact.setMobile(mobile);

			System.out.print("Enter work number : ");
			long work = scanner.nextLong();
			contact.setWork(work);

			System.out.print("Enter Email id : ");
			String email = scanner.next();
			contact.setEmail(email);

			System.out.println("Contact Updated sucessfully!");
			System.out.println(contact);
		} else {
			System.err.println("Contact not found");
		}

	}

	@Override
	public void findContactByFirstName() {
		System.out.print("Enter first name : ");
		String firstName = scanner.next();
		Contact[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			boolean flag = false;
			for (int i = 0; i < contacts.length; i++) {
				if (contacts[i].getFirstName().equals(firstName)) {
					flag = true;
					System.out.println(contacts[i]);
				}
			}
			if (!flag) {
				System.out.println("No Contact found");
			} else {
				System.err.println("Contacts not found");
			}
		}
	}

	@Override
	public void findContactByLastName() {
		System.out.print("Enter last name : ");
		String lastName = scanner.next();

		Contact[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			boolean flag = false;
			for (int i = 0; i < contacts.length; i++) {
				if (contacts[i].getLastName().equals(lastName)) {
					flag = true;
					System.out.println(contacts[i]);
				}
			}
			if (!flag) {
				System.out.println("No Contact found");
			} else {
				System.err.println("Contacts not found");
			}
		}
	}

	private int id() {
		return ++id;
	}

	@Override
	public void findAllContacts() {
		Contact[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			for (int i = 0; i < contacts.length; i++) {
				System.out.println(contacts[i]);
			}
		} else {
			System.err.println("Contacts not found");
		}
	}

	@Override
	public void search() {
		System.out.print("Enter pattern here : ");
		String pattern = scanner.next();

		Contact[] contacts = data.findAllContacts();
		if (contacts.length > 0) {
			boolean flag = false;
			for (int i = 0; i < contacts.length; i++) {
				Contact contact = contacts[i];
				if (contact.getFirstName().contains(pattern) || contact.getLastName().contains(pattern)
						|| contact.getEmail().contains(pattern) || String.valueOf(contact.getMobile()).contains(pattern)
						|| String.valueOf(contact.getWork()).contains(pattern)) {
					flag = true;
					System.out.println(contact);
				}
			}
			if (!flag) {
				System.out.println("No contact found");
			}
		} else
			System.err.println("Contacts not found");
	}
}
