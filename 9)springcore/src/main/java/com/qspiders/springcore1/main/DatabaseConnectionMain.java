package com.qspiders.springcore1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.qspiders.springcore1.bean.DatabaseConnection;
import com.qspiders.springcore1.bean.DatabaseConnection2;
import com.qspiders.springcore1.configuration.ApplicationConfiguration;

public class DatabaseConnectionMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
				
		DatabaseConnection bean1 = (DatabaseConnection) applicationContext.getBean("getDatabaseConnection");
		System.out.println(bean1);
		
//		DatabaseConnection bean = (DatabaseConnection) applicationContext.getBean("getDatabaseConnection3");
//		System.out.println(bean);

		DatabaseConnection2 bean2 = applicationContext.getBean(DatabaseConnection2.class);
		System.out.println(bean2);
		
//		DatabaseConnection bean = applicationContext.getBean(DatabaseConnection.class);
//		System.out.println(bean);
					
		((AbstractApplicationContext) applicationContext).close();
	}
}
