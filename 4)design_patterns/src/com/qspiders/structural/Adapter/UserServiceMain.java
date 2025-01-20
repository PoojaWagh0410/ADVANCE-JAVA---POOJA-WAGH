package com.qspiders.structural.Adapter;

public class UserServiceMain {
	
	public static void main(String[] args) {
		
		UserServices userServices = new UserServices();
		userServices.signUp();
		userServices.logIn();
	}	
}
