package com.dfmzone.springdemo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WelcomeService implements GenericWelcomeService {
    @Override
    public List<String> getWelcomeMessage(String name) {
        List<String> messages = new ArrayList<>();
        messages.add("WElcome");
        messages.add(name);

        return messages;
    }
}
