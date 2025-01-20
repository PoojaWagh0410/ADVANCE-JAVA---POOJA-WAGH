package com.qspiders.multithreading.producerAndConsumer;

public class ProductDriver {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		new Producer(product).start();
		new Consumer(product).start();
		new Consumer(product).start();
		new Producer(product).start();
	}
}
