package com.nit.bean;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userBeanCon")
public class UserBeanCon {

	
	private Integer userId;
    private String userName;
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
	@Inject
	public UserBeanCon(@Value("1001")Integer userId, @Value("Rajesh")String userName, @Value("raj@gmail.com")String email) {
		
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
	

}
