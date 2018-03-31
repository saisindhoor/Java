package com.nit.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class CustomerBean {

	@Autowired
	private UserBeanCon userBean;
	
	@Value("#{T(java.util.Arrays).asList('keyboard','mouse','led')}")
	private String[] orders;
	
	@Value("12/12/2014")
	private Date orderDate;

	public UserBeanCon getUserBean() {
		return userBean;
	}

	public String[] getOrders() {
		return orders;
	}

	public Date getOrderDate() {
		return orderDate;
	}
	
	
}
