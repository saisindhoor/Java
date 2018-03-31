package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.CustomerBean;
import com.nit.bean.Student;
import com.nit.bean.UserBeanCon;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.nit");
		context.refresh();
		UserBeanCon u=context.getBean("userBeanCon", UserBeanCon.class);
		System.out.println(u.getEmail());
		System.out.println(u.getUserName());
		System.out.println(u.getUserId());
		
		
				
		
		

	}

}
