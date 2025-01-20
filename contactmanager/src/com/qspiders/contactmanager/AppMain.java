package com.qspiders.contactmanager;

import java.util.Scanner;

import com.qspiders.contactmanager.business.Business;
import com.qspiders.contactmanager.business.BusinessImplementation;

public class AppMain {
	
	private static Business business = new BusinessImplementation();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("Enter 1 to add contact");
			System.out.println("Enter 2 to delete contact");
			System.out.println("Enter 3 to update contact");
			System.out.println("Enter 4 to find contact by first name");
			System.out.println("Enter 5 to find contact by last name");
			System.out.println("Enter 6 to find all contact");
			System.out.println("Enter 7 to search contact");
			System.out.println("Enter 8 to exit");
			
			System.out.print("Enter your choice : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				business.addContact();
				break;
			case 2:
				business.deleteContact();
				break;
			case 3:
				business.updateContact();
				break;
			case 4:
				business.findContactByFirstName();
				break;
			case 5:
				business.findContactByLastName();
				break;
			case 6:
				business.findAllContacts();
				break;
			case 7:
				business.search();
				break;
			case 8:
				System.out.println("See you soon!");
				run = false;
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
