package com.qspiders.bankingApllication.data;

import java.util.ArrayList;
import java.util.List;

import com.qspiders.bankingApllication.entity.User;

public class UserDataImplementation implements UserData {

	private List<User> users = new ArrayList<User>();

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println("User is created...✅");
	}

	@Override
	public void deleteUser(long mobileNumber, int securityPin) {
			boolean flag = false;
			for(User user : users) {
				if(user.getSecurityPin()==securityPin && user.getMobileNumber()==mobileNumber) {
					flag=true;
					users.remove(user);
					break;
				}
			}
			
			if(flag) {
				System.out.println("User get deleted...");
			}else {
				System.out.println("Something went wrong");
			}
	}
	
	@Override
	public void deleteUser(String email, int securityPin) {
			boolean flag = true;
			for(User user : users) {
				if(user.getEmail()==email && user.getSecurityPin()==securityPin) {
					flag=true;
					users.remove(user);
					break;
				}
			}
			if(flag) {
				System.out.println("User get deleted...");
			}else {
				System.out.println("Something went wrong");
			}
	}


	@Override
	public void updateUser(int securityPin) {
	
	}

	@Override
	public void findUser(int securityPin) {
		User user = null;
		for (User u : users) {
			if (u.getSecurityPin() == securityPin) {
				user = u;
				break;
			}
		}
		if (user != null) {
			System.out.println(user);
			System.out.println("Login Sucessful...!");
		} else
			System.out.println("Invalid security pin");
	}

	}
