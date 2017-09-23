package com.diego.springdemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.springdemo.service.RandomizerRequestScope;
import com.diego.springdemo.service.RandomizerSessionScope;

@Controller
public class ScopeController {
	
	@Autowired
	RandomizerRequestScope randomizerRequestScope;
	
	@Autowired
	RandomizerSessionScope randomizerSessionScope;
	
	@RequestMapping("/")
	public void getRandom(HttpServletResponse httpServletResponse) throws Exception {
		httpServletResponse.getWriter().write("Request scope <br>");
		httpServletResponse.getWriter().write("Old number " + randomizerRequestScope.getRandomNumber() + " <br>");
		randomizerRequestScope.generateRandomNumber();
		httpServletResponse.getWriter().write("New Number " + randomizerRequestScope.getRandomNumber() + " <br>");
		
		httpServletResponse.getWriter().write("Session Scope <br>");
		httpServletResponse.getWriter().write("Old number " + randomizerSessionScope.getRandomNumber() + " <br>");
		randomizerSessionScope.generateRandomNumber();
		httpServletResponse.getWriter().write("New number : " + randomizerSessionScope.getRandomNumber() + " <br>");
	}
}
