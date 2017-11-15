package com.timbuchalka.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timbuchalka.springdemo.service.GenericWelcomeService;
import com.timbuchalka.springdemo.service.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping({"/index", "/"})
	public String doWelcome(Model model) {
		
		// 1. Retrieving the processed data
//		WelcomeServicervice welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Diego");
		
		// 2.  Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		model.addAttribute("testAtt", "TEST VERIFIED");
		// 3.  Return logical view name
		return "welcomeNew";
	}
}
