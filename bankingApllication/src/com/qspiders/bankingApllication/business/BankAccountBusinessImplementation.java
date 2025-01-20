package com.qspiders.bankingApllication.business;

import java.util.Scanner;

import com.qspiders.bankingApllication.data.AccountData;
import com.qspiders.bankingApllication.data.AccountDataImplementation;
import com.qspiders.bankingApllication.entity.BankAccount;

public class BankAccountBusinessImplementation implements BankAccountBusiness{
	
	private AccountData accountData = new AccountDataImplementation();
	
	BankAccount bankAccount = new BankAccount();
	
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public void createBankAccount() {
		System.out.print("Enter Bank Name : ");
		String bankName = scanner.nextLine();
		
		System.out.print("Enter Bank Account Number : ");
		long accountNumber = scanner.nextLong();
		
		System.out.print("Enter Current account balance : ");
		double accountBalance = scanner.nextDouble();
		
		BankAccount bankAccount = new BankAccount(bankName, accountNumber, accountBalance);
		accountData.addAccount(bankAccount);
		
	}

	@Override
	public void deleteBankAccount() {
		System.out.println("Enter bank account number which you want to delete :");
		long accountNumber = scanner.nextLong();
		accountData.deleteAccount(accountNumber);		
	}

	@Override
	public void deposite() {
		System.out.print("Enter account number you want to deposite amount: ");
		long accountNumber = scanner.nextLong();
		
		System.out.print("Enter amount you want to deposite : ");
		double amount = scanner.nextDouble();
		
		accountData.depositeAmount(accountNumber,amount);
	}

	@Override
	public void withdraw() {
		System.out.print("Enter account number from which you want to withdraw amount: ");
		long accountNumber = scanner.nextLong();
		
		System.out.print("Enter amount you want to withdraw : ");
		double amount = scanner.nextDouble();	
		
		accountData.withdrwaAmount(accountNumber, amount);
	}

	@Override
	public void checkAccountBalance() {
		System.out.print("Enter account number to check the available balance : ");
		long accountNumber = scanner.nextLong();
		
		accountData.checkBalance(accountNumber);
		
	}

}
