package com.qspiders.multithreading;

public class App {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		for (int i = 0; i <= 1000000; i++) {
			System.out.println(i);
		}
		for (int i = 0; i <= 1000000; i++) {
			System.out.println(i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken : " + (end - start));
	}
}
