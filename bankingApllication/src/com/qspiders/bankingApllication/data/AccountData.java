package com.qspiders.bankingApllication.data;

import com.qspiders.bankingApllication.entity.BankAccount;

public interface AccountData {
	
	void addAccount(BankAccount bankAccount);
	
	void deleteAccount(long accountNumber);
	
	void depositeAmount(long accountNumber, double amount);
	
	void withdrwaAmount(long accountNumber, double amount);
	
	void checkBalance(long accountNumber);

}
