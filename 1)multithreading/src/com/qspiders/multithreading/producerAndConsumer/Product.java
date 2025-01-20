package com.qspiders.multithreading.producerAndConsumer;

public class Product {
	private boolean available;

	synchronized public void order() throws InterruptedException {
		if (this.available) {
			System.out.println("Product is available");
			System.out.println("Order is placed");
		} else {
			System.out.println("Product is currently unavailable");
			wait();
			if (this.available) {
				System.out.println("Product is available");
				System.out.println("Order is placed");
			}
		}
	}

	synchronized public void manufacture() {
		this.available = true;
		notifyAll();
	}

}
