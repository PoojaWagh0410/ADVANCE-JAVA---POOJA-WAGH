package com.pooja.Demo;

public class Driver {

	public static void main(String[] args) {

		Child c = new Child();
		c.dance();
		
		Parent p = new Parent();
		p.dance();
		
		Parent p1 = c;//Upcasting
		p1.dance();
		
		Child c1 = (Child)p1;//downcating
		c1.dance();
	}

}
