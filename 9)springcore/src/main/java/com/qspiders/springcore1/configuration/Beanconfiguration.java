package com.qspiders.springcore1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qspiders.springcore1.bean.BeanManager;

@Configuration
@ComponentScan(basePackages = "com.qspiders.springcore1.bean")
public class Beanconfiguration {

	@Bean(name = "manager")
	protected BeanManager getBeanManager() {

		return new BeanManager();
	}

//	@Bean(name = "operation")
//	protected BeanOperation getBeanOperation() {
//
//		return new BeanOperation();
//	}

}
