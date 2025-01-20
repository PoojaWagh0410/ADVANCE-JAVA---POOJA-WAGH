package com.qspiders.springcore1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope(value = "prototype")
//@Data
public class DatabaseConnection3 {

	//----1)  Feild - initialization
	@Value("com.mysql.cj.jdbc")
	private String name ;

	
	//---- 2) Setter - initialization 
//	@Value("com.mysql.cj.jdbc")
//	public void setName(String name) {
//		this.name = name;
//	} 
	

	//---- 3) constructor level - initialization
//	public DatabaseConnection3(@Value("com.mysql.cj.jdbc")String name) {
//		super();
//		this.name = name;
//	}
	
	//Constructor level initialization is recommanded bcz initialization is happens during object creation itself
	
	//--------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "DatabaseConnection3 [name=" + name + "]";
	}

	
	
	
}
