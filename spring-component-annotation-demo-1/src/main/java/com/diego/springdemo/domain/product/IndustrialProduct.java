package com.diego.springdemo.domain.product;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class IndustrialProduct implements GenericProduct {
    public int calculatePrice() {
        Random random = new Random();
        return random.nextInt(priceRandomize);
    }
}
