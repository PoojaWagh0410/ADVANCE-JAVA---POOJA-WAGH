package com.qspiders.multithreading.properties;

public class App {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread());
		thread1.setName("Thread1");
		thread1.setPriority(1);
		
		Thread thread2 = new Thread(new MyThread());
		thread2.setName("Thread2");
		thread2.setPriority(10);
		
		thread1.start();
		thread2.start();
	}
}
