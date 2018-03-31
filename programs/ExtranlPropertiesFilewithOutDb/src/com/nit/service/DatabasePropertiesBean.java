package com.nit.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("databaseProps")
public class DatabasePropertiesBean {
	
	@Value("${oracle.driverClassName}")
	private String driverClassName;
	
	@Value("${oracle.url}")
	private String url;
	
	@Value("${oracle.userName}")
	private String username;
	@Value("${oracle.password}")
	private String password;
	
	public String getDriverClassName() {
		return driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

}
