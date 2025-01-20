package com.qspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateDatabase1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Register the Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		// Get connection
		//Using 1st overloaded getConnection() methode which accepts 1 argument getConnection(string url)
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Pooja@1004");
		
		//Create Statement
		Statement statement = connection.createStatement();
		
		//Execute the Statement
		statement.execute("CREATE DATABASE Demo_Qspiders1");
		
		//Process the Result
		System.out.println("Database created");
		
		//Close Connection
		statement.close();
		connection.close();
		
		//De-Register the Driver
		DriverManager.deregisterDriver(driver);

	}	
}
