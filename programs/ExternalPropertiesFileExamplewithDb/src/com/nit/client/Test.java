package com.nit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.bean.Employee;
import com.nit.dao.EmployeeDAOImpl;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/resource/myBean.xml");
		
		EmployeeDAOImpl impl=(EmployeeDAOImpl)context.getBean("employeeDaoImpl");
		
		Employee emp=impl.getEmployee(2);
		
		if(emp !=null){
		System.out.println(emp.getEmpNo());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		}
		else{
			System.out.println("ur searcing empNo not found in database.");
		}
		
		
	}

}
