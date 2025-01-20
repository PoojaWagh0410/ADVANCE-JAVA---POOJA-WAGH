package com.qspiders.bankingApllication.business;

import java.util.Scanner;

import com.qspiders.bankingApllication.data.UserData;
import com.qspiders.bankingApllication.data.UserDataImplementation;
import com.qspiders.bankingApllication.entity.AadharCard;
import com.qspiders.bankingApllication.entity.User;
import com.qspiders.bankingApllication.enums.Gender;

public class UserBusinessImplementation implements UserBusiness {
	
	private UserData userData = new UserDataImplementation();

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void createUser() {
		System.out.print("Enter Username : ");
		String username = scanner.next();

		System.out.print("Enter Email address : ");
		String email = scanner.next();

		System.out.print("Enter Mobile Number : ");
		long mobileNumber = scanner.nextLong();

		System.out.print("Enter Aadhar Number : ");
		long aadharNumber = scanner.nextLong();
		scanner.nextLine();//nextLine() method of address will read the remaining space of aadhar number , so read this space we will provide on extra nextLine() method

		System.out.print("Enter Address : ");
		String address = scanner.nextLine();

		System.out.print("Enter Date of birth : ");
		String dob = scanner.next();

		Gender gender = null;
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("Choose Your Gender : ");
			System.out.println("Enter 1 for MALE");
			System.out.println("Enter 2 for FEMALE");
			System.out.println("Enter 3 for OTHERS");
			int choice = scanner.nextInt();

			switch (choice) {
					case 1: {
						gender = Gender.MALE;
						flag=false;
						break;
					}			
					case 2: {
						gender=Gender.FEMALE;
						flag=false;
						break;
					}			
					case 3: {
						gender=Gender.OTHERS;
						flag=false;
						break;
					}			
					default: {
						System.out.println("Invalid Choice...");
					}
			}
		}
		
		System.out.print("Enter Security pin : ");
		int securityPin = scanner.nextInt();
		
		AadharCard aadharCard = new AadharCard(aadharNumber, address, dob, gender);
		User user = new User(username, email, mobileNumber, securityPin, aadharCard);
		userData.addUser(user);	
	}

	@Override
	public void deleteUser() {
		System.out.println("Enter 1 to delete user using Mobile Number : ");
		System.out.println("Enter 2 to delete user using Email address : ");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.println("Enter Mobile Number");
				long mobileNumber = scanner.nextLong();

				System.out.println("Enter security pin");
				int securityPin = scanner.nextInt();		
				
				userData.deleteUser(mobileNumber, securityPin);	
			
			}break;
			
			case 2:{
				System.out.println("Enter Email address");
				String email = scanner.next();

				System.out.println("Enter security pin");
				int securityPin = scanner.nextInt();		
				
				userData.deleteUser(email, securityPin);					
			}break;
			
			default:{
				System.out.println("Invalid choice...");
			}			
		}
	}	

	@Override
	public void updateUser() {
	
	}

	@Override
	public void login() {
		System.out.print("Enter security pin : ");
		int securityPin = scanner.nextInt();
		userData.findUser(securityPin);
	}

	
}




