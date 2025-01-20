package com.qspiders.multithreading.synchronization;

public class MyThread1 extends Thread{

	private Resourse1 resourse1;
	
	MyThread1(Resourse1 resourse) {
		super();
		this.resourse1 = resourse1;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=100000;i++) {
			resourse1.increment();
		}
	}
}
