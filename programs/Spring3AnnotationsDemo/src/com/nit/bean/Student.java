package com.nit.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("123")
	private int sid;
	
	@Value("raj")
	private String sname;
	
	@Value("05/25/1990")
	private Date dob;
	
	@Value("#{T(java.util.Arrays).asList('java','spring','hibernate')}")
	private String[] subjects;
	
	@Autowired
	private Address address;
	
	

	public Address getAddress() {
		return address;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public Date getDob() {
		return dob;
	}

	public String[] getSubjects() {
		return subjects;
	}

}
