package com.mysql.jdbc.executeBatch;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletData {
	
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			
			query = "DELETE FROM users WHERE id = ?";
			
			preparedStatement = connection.prepareStatement(query);
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter number of records to be deleted : ");
			int records = scanner.nextInt();
			
			for(int i = 1 ; i <= records ; i++) {
				System.out.print("Enter user Id to be deleted : ");
				preparedStatement.setInt(1, scanner.nextInt());
				preparedStatement.addBatch();
			}
			scanner.close();
			
			int[] result = preparedStatement.executeBatch();
			int rows = 0;
			for(int i : result) {
				rows += i;
			}			
			System.out.println(rows+" row(s) affected...");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
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
