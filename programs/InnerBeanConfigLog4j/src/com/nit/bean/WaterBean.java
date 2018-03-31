package com.nit.bean;

import org.apache.log4j.Logger;

public class WaterBean {
	private static final Logger logger=Logger.getLogger(WaterBean.class.getName());
	
	private FishBean fishBean;

	public FishBean getFishBean() {
		return fishBean;
	}

	public void setFishBean(FishBean fishBean) {
		this.fishBean = fishBean;
		logger.info("setfish bean setFishName():"+fishBean.getFishName());
	}
	

}
