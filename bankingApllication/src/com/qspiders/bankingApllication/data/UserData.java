package com.qspiders.bankingApllication.data;

import com.qspiders.bankingApllication.entity.User;

public interface UserData {
	
	void addUser(User user);
	
	void deleteUser(long mobileNumber, int securityPin);
	
	void deleteUser(String email, int securityPin);
	
	void updateUser(int securityPin);
	
	void findUser(int securityPin);
	
}
