package com.qspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;

	public static void main(String[] args) {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "SELECT * FROM USERS";
			statement.execute(query);
			resultSet = statement.getResultSet();
			while (resultSet.next()) {
//				System.out.println(resultSet.getInt("id"));
//				System.out.println(resultSet.getString("Name"));
//				System.out.println(resultSet.getString("email"));
//				System.out.println(resultSet.getLong("mobile"));
//				System.out.println(resultSet.getString("password"));
				// ---------------------OR-----------------------
				System.out.println(resultSet.getInt("Id") + " : " + resultSet.getString("Name") + " , "
						+ resultSet.getString("email") + " , " + resultSet.getLong("mobile") + " , "
						+ resultSet.getString("password"));
				// --------------------OR------------------------
				// System.out.println(resultSet.getInt(1)+" : "+resultSet.getString(2)+" ,
				// "+resultSet.getString(3)+" , "+resultSet.getLong(4)+" ,
				// "+resultSet.getString(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Something went Wrong...");
		} finally {
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
		connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/demo_qspiders1?user=root&password=Pooja@1004");
		DriverManager.registerDriver(driver);
	}

	private static void closeConnection() throws SQLException {
		if (statement != null)
			statement.close();
		if (connection != null)
			connection.close();
		if (driver != null)
			DriverManager.deregisterDriver(driver);
	}
}
