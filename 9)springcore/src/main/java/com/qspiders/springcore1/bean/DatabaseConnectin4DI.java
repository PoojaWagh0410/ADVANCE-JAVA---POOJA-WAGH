package com.qspiders.springcore1.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class DatabaseConnectin4DI {

	@Autowired
	private DatabaseConnection3 databaseConnection3;

	public void setDatabaseConnection3(DatabaseConnection3 databaseConnection3) {
		this.databaseConnection3 = databaseConnection3;
	}
	
	

}
