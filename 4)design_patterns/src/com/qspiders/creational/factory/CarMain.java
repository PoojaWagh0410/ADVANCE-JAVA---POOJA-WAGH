package com.qspiders.creational.factory;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("Enter 1 to order Thar");
		System.out.println("Enter 2 to order Scorpio");
		System.out.println("Enter 3 to order Innova");
		System.out.println("Enter 4 to order XUV700");
		
		System.out.print("Enter your choice : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		
		try {
			factory(choice).order();
		} catch (NullPointerException e) {
			System.err.println("Something went wrong");
		}		
	}
	
	private static Car factory(int choice) {
		Car car = null;
		switch(choice) {
		case 1:
			car = new Thar();
			break;
		case 2:
			car = new Scorpio();
			break;
		case 3:
			car = new Innova();
			break;
		case 4:
			car = new XUV700();
			break;
		default:
			System.out.println("Invalid Choice");
		}
		return car;
	}
}
