package com.qspiders.springcore1.bean;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatabaseConnection2 {
	
	private String name;
	private int rollno;
	private String email;
	
	{
		System.out.println("Bean is created for DatabaseConnection2");
	}

	@Override
	public String toString() {
		return "DatabaseConnection2 [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
	}
	
	

}
