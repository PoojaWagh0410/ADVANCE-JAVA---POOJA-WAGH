package com.qspiders.multithreading.sleepMethod;

public class sleepMethod {

		public static void main(String[] args) throws InterruptedException {

			String message = "Java is a programming Language";
			
			for(int i = 0 ; i<=message.length();i++) {
				System.out.print(message.charAt(i));
				Thread.sleep(1000);
			}
		}
	}

