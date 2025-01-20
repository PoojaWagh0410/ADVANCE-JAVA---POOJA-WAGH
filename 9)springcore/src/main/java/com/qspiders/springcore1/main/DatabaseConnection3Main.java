package com.qspiders.springcore1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.qspiders.springcore1.bean.DatabaseConnection3;

public class DatabaseConnection3Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.qspiders.springcore1.bean");
		DatabaseConnection3 bean = applicationContext.getBean(DatabaseConnection3.class);
		System.out.println(bean);

		((AnnotationConfigApplicationContext) applicationContext).close();
	
	}
}
