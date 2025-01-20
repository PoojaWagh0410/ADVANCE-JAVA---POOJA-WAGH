package com.qspiders.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase3 {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) throws IOException {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "CREATE DATABASE demo_qspiders3";
			statement.execute(query);
			System.out.println("Database Created Sucessfully...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}
	
	private static void openConnection() throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		//Using 3rd overloaded getConnection() methode which accepts 3 strings getConnection(url,user,password)
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Pooja@1004");		
	}
	
	private static void closeConnection() throws SQLException {
		if(statement != null)
			statement.close();
		if(connection != null)
			connection.close();
		if(driver != null)
			DriverManager.deregisterDriver(driver);		
	}
}