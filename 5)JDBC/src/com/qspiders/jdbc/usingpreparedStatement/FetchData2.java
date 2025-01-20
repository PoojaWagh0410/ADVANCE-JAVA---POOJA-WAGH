package com.qspiders.jdbc.usingpreparedStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchData2 {
	
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			openConnection();
			
			query = "SELECT name, password FROM users WHERE id = ?";
			
			preparedStatement = connection.prepareStatement(query);
			
			System.out.print("Enter id : ");
			preparedStatement.setInt(1, scanner.nextInt());
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				System.out.println("Name is - "+resultSet.getString("name")+" and Password is - "+resultSet.getString("password"));
			}else {
				System.out.println("Invalid Id...");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}	
	
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_qspiders1","root","Pooja@1004");
	}
	
	private static void closeConnection() throws SQLException {
		if(preparedStatement != null)
			preparedStatement.close();
		if(connection != null)
			connection.close();
		if(driver != null)
			DriverManager.deregisterDriver(driver);
	}
}
