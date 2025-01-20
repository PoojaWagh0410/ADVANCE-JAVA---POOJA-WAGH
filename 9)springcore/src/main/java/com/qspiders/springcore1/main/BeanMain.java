package com.qspiders.springcore1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qspiders.springcore1.bean.BeanManager;
import com.qspiders.springcore1.bean.BeanOperation;
import com.qspiders.springcore1.configuration.Beanconfiguration;

public class BeanMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Beanconfiguration.class);
		
		BeanOperation bean2 = (BeanOperation) applicationContext.getBean("operation");
		System.out.println(bean2);
		
		BeanManager bean = (BeanManager) applicationContext.getBean("manager");
		System.out.println(bean);
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}
}
