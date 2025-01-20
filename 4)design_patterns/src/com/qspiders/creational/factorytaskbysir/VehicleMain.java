package com.qspiders.creational.factorytaskbysir;

import java.util.Scanner;

public class VehicleMain {
	
      public static void main(String[] args) {		
    	  
    	  System.out.println("Enter 1 to book Auto ");
    	  System.out.println("Enter 2 to book Cedan ");
    	  System.out.println("Enter 3 to book Luxury ");
    	  System.out.println("Enter 4 to book SUV ");
    	  
    	  System.out.print("Enter your choice : ");
    	  Scanner scanner = new Scanner(System.in);
    	  int choice = scanner.nextInt();
    	  scanner.close();
    	  
    	 try {
			factory(choice).book();
		} catch (NullPointerException e) {
			System.out.println("Something went Wrong");
		}    			  
	}
      
      private static Vehicle factory(int choice) {
    	  Vehicle vehicle = null;
    	  switch(choice) {  	  	
    	  case 1:
    		  vehicle = new Auto();
    		  break;
    	  case 2 :
    		  vehicle = new Cedan();
    		  break;
    	  case 3:
    		  vehicle = new Luxury();
    		  break;
    	  case 4:
    		  vehicle = new SUV();
    		  break;
    	  default:
    		   System.out.println("Invalid choice ");    		 
    	  }
    	  return vehicle;
      }
}
