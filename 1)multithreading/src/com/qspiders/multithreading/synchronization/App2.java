package com.qspiders.multithreading.synchronization;

public class App2 {

	public static void main(String[] args) throws InterruptedException {
		Resourse1 resourse1 = new Resourse1();
		
		MyThread1 thread1 = new MyThread1(resourse1);
		MyThread1 thread2 = new MyThread1(resourse1);
		
		thread1.start();
		thread2.start();
		
		Thread.sleep(3000);
		
		System.out.println(resourse1.getCount());
	}

}
