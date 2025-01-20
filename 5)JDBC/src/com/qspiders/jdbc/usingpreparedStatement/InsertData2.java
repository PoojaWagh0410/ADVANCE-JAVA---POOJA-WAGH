package com.qspiders.jdbc.usingpreparedStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData2 {
	

	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			openConnection();
			query = "INSERT INTO USERS VALUES(?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			System.out.print("Enter id : ");
			preparedStatement.setInt(1, scanner.nextInt());
			System.out.print("Enter name : ");
			preparedStatement.setString(2, scanner.next());
			System.out.print("Enter email : ");
			preparedStatement.setString(3, scanner.next());
			System.out.print("Enter mobile : ");
			preparedStatement.setLong(4, scanner.nextLong());
			System.out.print("Enter password : ");
			preparedStatement.setString(5, scanner.next());
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows+" row(s) affected...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Something went wrong...");
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
