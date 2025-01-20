//Program 2
//Write a java program to check whether given Strings are anagram	

package com.pooja.Demo;

import java.util.Scanner;

public class Demo1 {
	static String s1 = "POO";
	static String s2="POO";

	public static void main(String[] args) {

		System.out.println(check(s1,s2));

		if (check(s1, s2) == true) {
			for (int i = s1.charAt(0); i < s1.length(); i++) {
				for(int j = s2.charAt(0) ; j < s2.length(); j++) {
					if(s1.charAt(i) == s2.charAt(j)) {
						i++;
						j++;
						System.out.println("Strings are Anagram");
					}
					else {
						System.out.println("Strings are not anagram");
					}
				}
			}
		}
	}

	public static boolean check(String s1, String s2) {
//		boolean checkLength = false ;
		if (s1.length() == s2.length()) {
			return true;
		} else {
			return false;
		}
	}

}
