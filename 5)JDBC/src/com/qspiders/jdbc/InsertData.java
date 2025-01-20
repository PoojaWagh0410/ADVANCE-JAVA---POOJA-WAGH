package com.qspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "INSERT INTO USERS VALUES(5,'Swami','swami@gmail.com',9209091111,'swami@2323')";
			statement.execute(query);
			System.out.println("Record is Inserted...");
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Something went Wrong...");
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_qspiders1?user=root&password=Pooja@1004");
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
