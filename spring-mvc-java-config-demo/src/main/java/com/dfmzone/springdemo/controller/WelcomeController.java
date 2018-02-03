package com.dfmzone.springdemo.controller;

import java.util.List;

import com.dfmzone.springdemo.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dfmzone.springdemo.service.GenericWelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private GenericWelcomeService welcomeService;

	@Autowired
	RandomService randomService;

	@RequestMapping
	public String doWelcome(Model model) {
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Diego");

		model.addAttribute("message", welcomeMessage);

		return "WelcomeNew";
	}

	@RequestMapping("/random")
	public String doRandom(Model model) {
		model.addAttribute("random", randomService.randomNumGen());

		return "WelcomeNew";
	}
}
