package com.qspiders.bankingApllication;

import java.util.Scanner;

import com.qspiders.bankingApllication.business.BankAccountBusiness;
import com.qspiders.bankingApllication.business.BankAccountBusinessImplementation;
import com.qspiders.bankingApllication.data.AccountData;

public class AccountApp {

	public static void main(String[] args) {

		BankAccountBusiness bankAccountBusiness = new BankAccountBusinessImplementation();

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("Enter 1 to create an bank account ");
			System.out.println("Enter 2 to delete an bank account ");
			System.out.println("Enter 3 to deposite amount ");
			System.out.println("Enter 4 to withdraw amount ");
			System.out.println("Enter 5 to Fetch Account balance ");
			System.out.println("Enter 6 to Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				bankAccountBusiness.createBankAccount();
				break;
			case 2:
				bankAccountBusiness.deleteBankAccount();
				break;
			case 3:
				bankAccountBusiness.deposite();
				break;
			case 4:
				bankAccountBusiness.withdraw();
				break;
			case 5:
				bankAccountBusiness.checkAccountBalance();
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
