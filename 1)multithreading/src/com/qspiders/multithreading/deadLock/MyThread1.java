package com.qspiders.multithreading.deadLock;

public class MyThread1 extends Thread {

	private Resourse resourse1;
	private Resourse resourse2;

	public MyThread1(Resourse resourse1, Resourse resourse2) {
		super();
		this.resourse1 = resourse1;
		this.resourse2 = resourse2;
	}

	@Override
	public void run() {
		
		synchronized (resourse1) {
			System.out.println("Thread1 applies lock on resourse1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourse2) {
				System.out.println("Thread1 applies lock on resourse2");
			}
		}
	}
}
