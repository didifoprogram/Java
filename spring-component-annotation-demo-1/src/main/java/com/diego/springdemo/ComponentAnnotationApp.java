package com.diego.springdemo;

import com.diego.springdemo.domain.promotion.TradeFair;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentAnnotationApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

//        Organization org = (Organization) ctx.getBean("myOrg");
//
//        System.out.println(org);
//        System.out.println(org.corporateService());

        // TradeFair is using Annotations

        TradeFair tradeFair = (TradeFair) ctx.getBean("myFair");
        System.out.println(tradeFair.specialPromotionalPricing());

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
