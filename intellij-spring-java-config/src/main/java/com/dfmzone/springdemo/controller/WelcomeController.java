package com.dfmzone.springdemo.controller;

import com.dfmzone.springdemo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    @RequestMapping
    public String doWelcome(Model model) {
        List<String> message = welcomeService.getWelcomeMessage("DIego");

        model.addAttribute("message", message);

        return "index";
    }
}
