package com.qspiders.multithreading.threads;

public class Thread1_Driver {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		
		t1.start();
		t2.start();
		
		Thread.sleep(4000);
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time Taken : "+(end-start));
		
	}

}
