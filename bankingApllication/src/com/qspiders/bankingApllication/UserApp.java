package com.qspiders.bankingApllication;

import java.util.Scanner;

import com.qspiders.bankingApllication.business.UserBusiness;
import com.qspiders.bankingApllication.business.UserBusinessImplementation;

public class UserApp {
	
	public static void main(String[] args) {
		
		UserBusiness userBusiness = new UserBusinessImplementation();

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("Enter 1 to create an User");
			System.out.println("Enter 2 to login");
			System.out.println("Enter 3 to delete User");
			System.out.println("Enter 4 to update an account");
			System.out.println("Enter 5 to exit");
			System.out.println("Enter your choice");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				userBusiness.createUser();
				break;
			case 2:
				userBusiness.login();
				break;
			case 3:
				userBusiness.deleteUser();
				break;
			case 4:
				userBusiness.updateUser();
				break;
			case 5:
				run = false;
				System.out.println("Thank you");
				break;
			default:
				System.err.println("Invalid choice");
			}
		}
		scanner.close();			
	}		
}