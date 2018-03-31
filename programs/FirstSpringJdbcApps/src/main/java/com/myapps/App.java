package com.myapps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapps.dao.EmployeeDAO;
import com.myapps.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/myapps/config/spring.xml");
    	 EmployeeDAO empDao=context.getBean("employeeDao",EmployeeDAO.class);
    	 System.out.println("Testing of createEmployeeName(-,-)");
    	 
    	 Employee e=new Employee();
    	 e.setEmpId(123);
    	 e.setName("raj");
    	 e.setSalary(5000);
    	 
    	int count = empDao.createEmployee(e);
    	if(count>0)
    		System.out.println("successfully inserted....");
    	else
    		System.out.println("try again...");

    }
}
