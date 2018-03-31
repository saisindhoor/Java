package com.nit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userBean")
public class UserBean {
	
	@Value("1001")
	private Integer userId;
	
	@Value("Rajesh")
	private String userName;
	
	@Value("raj@gmail.com")
	private String email;

	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}
	
	
	

	
}
