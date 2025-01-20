package com.qspiders.multithreading.twoWaysOfCreatingThreads;

public class firstWayOfCreatingThread implements Runnable {

	@Override
	public void run() {
			for(int i=0; i<=10;i++) {
				System.out.println("First way of Creating Thread");
			}
	}
	
	
}
