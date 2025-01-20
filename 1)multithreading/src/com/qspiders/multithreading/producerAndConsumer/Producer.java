package com.qspiders.multithreading.producerAndConsumer;

public class Producer extends Thread{
	
	private Product product;

	public Producer(Product product) {
		super();
		this.product = product;
	}
	
	@Override
	public void run() {
		product.manufacture();
	}	
}
