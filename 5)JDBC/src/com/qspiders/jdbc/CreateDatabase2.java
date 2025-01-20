package com.qspiders.jdbc;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateDatabase2 {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) throws IOException {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "CREATE DATABASE demo_qspiders2";
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
		File file = new File("C:\\Users\\SATYAM\\OneDrive\\Documents\\OneNote Notebooks\\dp_props.txt");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		//Using 2nd overloaded getConnection() methode which accepts 2 arguments getConnection(String url, properties properties)
		connection = DriverManager.getConnection(properties.getProperty("url"), properties);		
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