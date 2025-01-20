package com.qspiders.multithreading.synchronization;

public class Resourse1 {
	private int count;
	
	synchronized public void increment(){
		count++;
	}
	
	public int getCount() {
		return this.count;
	}
}
