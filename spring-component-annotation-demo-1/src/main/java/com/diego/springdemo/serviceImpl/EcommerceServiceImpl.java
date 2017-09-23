package com.diego.springdemo.serviceImpl;

import com.diego.springdemo.service.BusinessService;

import java.util.Random;

public class EcommerceServiceImpl implements BusinessService {

    public String offerService(String companyName) {
        Random random = new Random();
        return "\nAs an organization, " + companyName + " offers world class E-commerce" +
                " service." + "\nThe annual income exceeds " + random.nextInt(revenue);
    }

    public void postConstruct() {
        System.out.println("cloudService: postConstruct called...............");
    }

    public void preDestroy() {
        System.out.println("cloudService: preDestroy called...............");
    }
}
