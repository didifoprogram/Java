package com.dfmzone.springdemo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WelcomeService {

    public List<String> getWelcomeMessage(String name) {
        List<String> message = new ArrayList<String>();

        message.add("Welcome ");
        message.add(name);

        return message;
    }

}
