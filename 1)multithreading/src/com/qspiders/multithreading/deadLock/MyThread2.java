package com.qspiders.multithreading.deadLock;

public class MyThread2 extends Thread{
	
	private Resourse resourse1;
	private Resourse resourse2;
	
	public MyThread2(Resourse resourse1, Resourse resourse2) {
		super();
		this.resourse1 = resourse1;
		this.resourse2 = resourse2;
	}
	
	@Override
	public void run() {
		
		synchronized (resourse2) {
			System.out.println("Thread2 applies lock on resourse 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourse1) {
				System.out.println("Thread2 applies lock on resourse 1");
			}
		}
	}
	
	
}
