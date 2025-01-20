package com.qspiders.springcore2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcore2.bean.DataSharing;

public class DataSharingMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.qspiders.springcore2.bean");
		DataSharing bean = applicationContext.getBean(DataSharing.class);
		System.out.println(bean);
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
