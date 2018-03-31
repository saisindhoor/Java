package com.nit.bean;

import org.apache.log4j.Logger;

public class FishBean {
	
	private static final Logger logger=Logger.getLogger(FishBean.class);

	private String fishName;

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
		logger.debug("enter into setFishName() name is:"+getFishName());
	}
	
}
