package com.nit.client;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.bean.FishBean;
import com.nit.bean.WaterBean;

public class Test {

	private static final Logger logger = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {

		logger.info("START :: MAIN()");
		String configFile = "com/nit/config/myBean.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(
				configFile);
		WaterBean wbean = context.getBean("waterBean", WaterBean.class);
		FishBean fbean = wbean.getFishBean();
		logger.info("FishName:" + fbean.getFishName());

		logger.info("END :: MAIN()");
	}

}
