package com.qspiders.multithreading.properties;


public class MyThread implements Runnable{


	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for(int i=0; i<=10;i++) {
			System.out.println(thread.getName()+" is running.");
		}		
	}	
}












