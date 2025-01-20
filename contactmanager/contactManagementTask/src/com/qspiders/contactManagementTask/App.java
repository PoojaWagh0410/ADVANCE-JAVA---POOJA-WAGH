package com.qspiders.contactManagementTask;

import java.util.Scanner;

import com.qspiders.contactManagementTask.business.ContactBusiness;
import com.qspiders.contactManagementTask.business.contactBusinessImplementation;

public class App {	
	
	public static void main(String[] args) {
		ContactBusiness contactBusiness = new contactBusinessImplementation();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("Enter 1 to add contacts : ");
			System.out.println("Enter 2 to view contacts : ");
			System.out.println("Enter 3 to Exit : ");
			
			System.out.print("Enter your choice here : ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				contactBusiness.addContacts();
				break;
			}
			case 2: {
				contactBusiness.viewContacts();
				break;
			}
			case 3:{
				System.out.println("See you soon!");
				run = false;
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
