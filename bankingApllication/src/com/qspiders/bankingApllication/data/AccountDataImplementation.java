package com.qspiders.bankingApllication.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qspiders.bankingApllication.business.BankAccountBusiness;
import com.qspiders.bankingApllication.entity.BankAccount;

public class AccountDataImplementation implements AccountData {

	private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

	private BankAccount bankAccount = new BankAccount();

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void addAccount(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
		System.out.println("Bank Account created sucessfully...");
	}

	@Override
	public void deleteAccount(long accountNumber) {
		boolean flag = false;

		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountNumber() == accountNumber) {
				flag = true;
				bankAccounts.remove(bankAccount);
				break;
			}
		}
		if (flag) {
			System.out.println("Account deleted Successfully...");
		} else {
			System.out.println("Something went wrong");
		}
	}

	@Override
	public void depositeAmount(long accountNumber, double amount) {
		BankAccount bankAccount = findAccount(accountNumber);
		if (bankAccount != null) {
			bankAccount.deposite(amount);
			System.out.println(amount + " rupees is deposited sucessfully... ");
			bankAccount.currentBalance();
		} else {
			System.out.println("Bank account with account Number " + accountNumber + " is not exist...");
		}
	}

	@Override
	public void withdrwaAmount(long accountNumber, double amount) {
		BankAccount bankAccount = findAccount(accountNumber);
		if (bankAccount != null) {
			bankAccount.withdraw(amount);
			System.out.println(amount + " rupees withdrawn sucessfully...");
			bankAccount.currentBalance();
		} else {
			System.out.println("Bank account with account Number " + accountNumber + " is not exist...");
		}
	}

	@Override
	public void checkBalance(long accountNumber) {
		BankAccount bankAccount = findAccount(accountNumber);
		if (bankAccount != null) {
			bankAccount.currentBalance();
		} else {
			System.out.println("Bank account with account Number " + accountNumber + " is not exist...");
		}
	}

	private BankAccount findAccount(long accountNumber) {
		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountNumber() == accountNumber) {
				return bankAccount;
			}
		}
		return null;
	}

}
