package com.qspiders.springcore1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.qspiders.springcore1.bean.DatabaseConnection;
import com.qspiders.springcore1.bean.DatabaseConnection2;

@Configuration
public class ApplicationConfiguration {

	@Bean
	@Scope(value = "prototype")// By default the scope is "singleton"
	protected DatabaseConnection getDatabaseConnection() {

		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.setUrl("jdbc:mysql://localhost:3306");
		databaseConnection.setUsername("root");
		databaseConnection.setPassword("Pooja@1004");

		return databaseConnection;
	}
	
	@Bean
	@Scope(value = "prototype")
	protected DatabaseConnection getDatabaseConnection3() {

		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.setUrl("Gaurav");
		databaseConnection.setUsername("Wagh");
		databaseConnection.setPassword("gaurava@1004");

		return databaseConnection;
	}

	@Bean
	protected DatabaseConnection2 getDatabaseConnection2() {

		DatabaseConnection2 databaseConnection2 = new DatabaseConnection2("Pooja", 101, "poojawagh768@gmail.com");
		return databaseConnection2;
	}
	
	
	
}
