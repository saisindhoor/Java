package com.nit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.DatabasePropertiesBean;

public class Test {

	
	public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/resource/myBean.xml");
		
		DatabasePropertiesBean dbProperties=(DatabasePropertiesBean)context.getBean("databaseProps");
		System.out.println("driverName:"+dbProperties.getDriverClassName());
		System.out.println("url:"+dbProperties.getUrl());
		System.out.println("username:"+dbProperties.getUsername());
		System.out.println("password:"+dbProperties.getPassword());
	}

}
