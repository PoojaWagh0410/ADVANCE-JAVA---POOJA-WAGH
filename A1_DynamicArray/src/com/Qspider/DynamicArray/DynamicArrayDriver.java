package com.Qspider.DynamicArray;

import java.lang.foreign.AddressLayout;

public class DynamicArrayDriver {
	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(70);
		d.add(80);
		d.add(90);
		d.add(100);

		d.print();

		d.delete();

		d.print();
		
		d.delete();

		d.print();
		
		d.delete(2);
		d.print();
		
		d.delete(100);
		d.print();
		
		d.set(321, 3);
		d.print();
		
		d.put(789, 0);
		d.print();

	}
}
