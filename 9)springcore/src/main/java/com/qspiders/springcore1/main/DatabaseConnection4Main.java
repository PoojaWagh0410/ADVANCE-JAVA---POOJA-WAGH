package com.qspiders.springcore1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcore1.bean.DatabaseConnectin4DI;

public class DatabaseConnection4Main {
	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.qspiders.springcore1.bean");
		DatabaseConnectin4DI bean = applicationContext.getBean(DatabaseConnectin4DI.class);
		System.out.println(bean);
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
