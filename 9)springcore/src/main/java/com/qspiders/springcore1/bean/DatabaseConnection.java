package com.qspiders.springcore1.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DatabaseConnection {
	
	private String url;
	private String username;
	private String password;
	
	{
		System.out.println("Bean is created for DatabaseConnection");
	}

	@Override
	public String toString() {
		return "DatabaseConnection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

	
	
}
