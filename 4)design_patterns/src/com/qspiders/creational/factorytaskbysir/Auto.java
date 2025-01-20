package com.qspiders.creational.factorytaskbysir;

public class Auto implements Vehicle{

	@Override
	public void book() { 
		String charges = "10";
		System.out.println("You booked AutoRiksh for ride");
	}
}
