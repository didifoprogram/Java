package com.dfmzone.springdemo.controller;

import com.dfmzone.springdemo.service.GenericWelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    private GenericWelcomeService welcomeService;


    @RequestMapping
    public String doWelcome(Model model) {
        List<String> message = welcomeService.getWelcomeMessage("Diego");

        model.addAttribute("messages", message);
        model.addAttribute("testMessage", "TESTING");

        return "index";

    }
}
