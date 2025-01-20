package com.qspiders.bankingApllication.entity;

public class BankAccount {
	
	private String bankName;
	private long accountNumber;
	private double accountBalance;
	
	public BankAccount() {
		super();
	}
	
	public BankAccount(String bankName, long accountNumber, double accountBalance) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getBankName() {
		return bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double deposite(double amount) {
		accountBalance += amount;
		return accountBalance;
	}
	
	public double withdraw(double amount) {
		if(amount <= accountBalance && amount >= 0) {
			accountBalance -= amount;
		}else {
			System.out.println("Insufficient account balance...");
		}
		return accountBalance;
	}	
	
	public void currentBalance() {		
		System.out.println("AVailable balance is : "+accountBalance);
	}

	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", accountNumber=" + accountNumber + "]";
	}
}









