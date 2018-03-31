package com.nit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("hyd")
	private String city;
	
	@Value("500082")
	private String pincode;

	public String getCity() {
		return city;
	}

	public String getPincode() {
		return pincode;
	}
	
	

}
