package com.qspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Register the Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Get the conection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_qspiders1?user=root&password=Pooja@1004");
		
		//Create Statement
		Statement statement = connection.createStatement();
		
		//Execute the statement
		statement.execute(
				"CREATE TABLE USERS(id int primary key, name varchar(20) not null, email varchar(20) not null unique, mobile bigint(10) not null unique, password varchar(20) not null)");
		
		//Process the result
		System.out.println("Table is Created!!!!");
		
		//close the connection
		statement.close();
		connection.close();
		
		//Deregister the Driver
		DriverManager.deregisterDriver(driver);
	}
}