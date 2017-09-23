package com.timbuchalka.springdemo;

import com.timbuchalka.springdemo.domain.Organization;
import com.timbuchalka.springdemo.domain.Organization2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesWithAnnotationApp {

    public static void main(String[] args) {
//		 create the application context (container)
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
//
//
////		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
////		System.out.println(tradeFair.specialPromotionalPricing());
//
//
//		 close the application context (container)
//		((ClassPathXmlApplicationContext) ctx).close();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
        Organization org = (Organization) ctx.getBean("myorg");
//        System.out.println(org);
//        System.out.println(org.corporateSlogan());

        Organization2 org2 = (Organization2) ctx.getBean("myorg2");
        System.out.println(org2);

        ((AnnotationConfigApplicationContext) ctx).close();

    }

}
