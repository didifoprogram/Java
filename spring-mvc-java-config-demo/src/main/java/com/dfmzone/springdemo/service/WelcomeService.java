package com.dfmzone.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService implements GenericWelcomeService{

	@Override
	public List<String> getWelcomeMessage(String name) {
		List<String> message = new ArrayList<>();
		message.add("HELLO");
		message.add(name);
		
		return message;
	}
	
}
