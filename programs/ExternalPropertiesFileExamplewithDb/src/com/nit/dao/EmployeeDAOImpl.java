package com.nit.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.bean.Employee;

@Repository("employeeDaoImpl")
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private DataSource dataSource;
	
	public Employee getEmployee(int empNo){
		Employee employee=null;
		Connection connection=null;
		
		try{
			connection=dataSource.getConnection();
			PreparedStatement pstm=connection.prepareStatement("select * from emp where eid=?");
			pstm.setInt(1, empNo);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				
				employee=new Employee();
				employee.setEmpNo(rs.getInt("eid"));
				employee.setEmpName(rs.getString("ename"));
				employee.setSalary(rs.getInt("salary"));
				
			}
			
		}
		catch(SQLException s)
		{
			System.out.println("error");
		}
		return employee;
	}
	

}
