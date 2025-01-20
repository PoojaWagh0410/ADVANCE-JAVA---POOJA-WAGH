package com.qspiders.jdbc.callablestatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class JDBC_call {	

	private static Driver driver;
	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static String query;

	public static void main(String[] args) {
		try {
			openConnection();
			query = "CALL sort_by_name";
			callableStatement = (CallableStatement) connection.prepareCall(query);
			callableStatement.execute();
			resultSet = callableStatement.getResultSet();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
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

	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_qspiders1", "root", "Pooja@1004");
	}

	private static void closeConnection() throws SQLException {
		if (callableStatement != null)
			callableStatement.close();
		if (connection != null)
			connection.close();
		if (driver != null)
			DriverManager.deregisterDriver(driver);
	}
}