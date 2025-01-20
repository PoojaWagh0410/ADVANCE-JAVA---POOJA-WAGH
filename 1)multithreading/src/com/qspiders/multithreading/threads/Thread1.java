package com.qspiders.multithreading.threads;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i <= 100000; i++) {
			System.out.println(i);
		}
	}

}
