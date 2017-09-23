package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.Organization;
import com.timbuchalka.springdemo.domain.promotion.TradeFair;

public class PropertiesWithXmlApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		
//		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
//		System.out.println(tradeFair.specialPromotionalPricing());
		
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);


		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
