package com.qspiders.multithreading.deadLock;

public class App {

	public static void main(String[] args) {
		
		Resourse resourse1 = new Resourse();
		Resourse resourse2 = new Resourse();
		
		MyThread1 thread1 = new MyThread1(resourse1, resourse2);
		thread1.setPriority(1);
		
		MyThread1 thread2 = new MyThread1(resourse1, resourse2);
		thread2.setPriority(10);
		
		thread1.start();
		thread2.start();		
	}
}
