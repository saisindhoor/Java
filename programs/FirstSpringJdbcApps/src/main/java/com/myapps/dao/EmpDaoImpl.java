package com.myapps.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.myapps.model.Employee;

public class EmpDaoImpl  implements EmployeeDAO{
	
	private JdbcTemplate jdbcTemplate;	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	public int createEmployee(Employee employee) {
		int count=0;
		
		String sql="insert into employee values(?,?,?)";
		count=jdbcTemplate.update(sql, employee.getEmpId(),employee.getName(),employee.getSalary());
		
		return count;
	}
	
	

}
