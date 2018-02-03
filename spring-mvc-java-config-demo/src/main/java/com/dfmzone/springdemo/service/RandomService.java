package com.dfmzone.springdemo.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomService {

    public int randomNumGen() {
        Random random = new Random();
        return random.nextInt()*10;
    }
}
