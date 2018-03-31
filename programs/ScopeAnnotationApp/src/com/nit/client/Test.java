package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.bean.Student;

public class Test {

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.nit.bean");
		context.refresh();
		
		/*ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/config/myBean.xml");*/

		Student s1 = (Student) context.getBean("student");

		s1.setStudentId(123);
		s1.setStudentName("ramu");

		System.out.println(s1);

		Student s2 = (Student) context.getBean("student");
		System.out.println(s2);
		
		

	}

}
