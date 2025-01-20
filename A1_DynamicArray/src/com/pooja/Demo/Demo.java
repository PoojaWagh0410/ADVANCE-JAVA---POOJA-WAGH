//Program - 1
//Write a java program to print the characters present inside a String along with there frequency
//String - JAVA IS PROGRAMMING LANGUAGE

package com.pooja.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String s = scan.nextLine();
//
//		// Call the method to print character frequencies
//		printCharacterFrequencies(s);
//	}
//
//	public static void printCharacterFrequencies(String s) {
//		// Convert string to char array
//		char[] chars = s.toCharArray();
//
//		// Array to store frequency of characters (assuming ASCII)
//		int[] frequency = new int[256]; // For extended ASCII characters
//
//		// Count the frequency of each character
//		for (int i = 0; i < chars.length; i++) {
//			frequency[chars[i]]++;
//		}
//
//		// Print the frequencies
//		System.out.println("Character Frequencies:");
//		for (int i = 0; i < frequency.length; i++) {
//			if (frequency[i] > 0) {
//				System.out.println((char) i + " : " + frequency[i]);
//			}
//		}
		
//		ArrayList a = new ArrayList();
//		a.add("AAA");
//		a.add("BBB");
//		a.add("CCC");
//		a.add("Hii");
//		a.add(111);
//		a.add(333);
//		a.add("Hii");
//		System.out.println("a : "+a);
//		ArrayList b = new ArrayList();
//		b.add("AAA");
//		b.add(111);
//		b.add(444);
//		b.add(5);
//		b.add(333);
//		System.out.println("B : "+b);
////		System.out.println(a.remove(new Integer(333)));
//		a.retainAll(b);
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		 ArrayList a1=new ArrayList();
		 a1.add(4);
		 a1.add(15);
		 a1.add(6);
		 a1.add(123);
		 a1.add(76);
		 System.out.println("Before sorting -->"+a1);
		 Collections.sort(a1);
		 System.out.println("After sorting -->"+a1); 
 		 Collections.reverse(a1);
		 System.out.println("Descending order-->"+a1);
	}
}


