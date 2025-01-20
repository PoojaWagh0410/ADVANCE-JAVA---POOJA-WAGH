package com.qspiders.creational.singleton;

// LAZY Instantiation in singleton design pattern :
//public class DatabaseConnection {
//
//	private static DatabaseConnection connection;
//
//	public DatabaseConnection() {
//		super();
//	}
//	
//	public static DatabaseConnection getConnection() {
//		if(connection == null) {
//			connection = new DatabaseConnection();
//		}
//		return connection;
//	}	
//}



//Eager Instantiation in singleton design pattern :
public class DatabaseConnection {

	private static DatabaseConnection connection = new DatabaseConnection();

	public DatabaseConnection() {
		super();
	}		
	
	public static DatabaseConnection getConnection() {
		return connection;
	}
}
