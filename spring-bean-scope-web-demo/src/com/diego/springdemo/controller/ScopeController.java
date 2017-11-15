package com.diego.springdemo.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.springdemo.service.RandomizeRequestScope;
import com.diego.springdemo.service.RandomizeSessionScope;

@Controller
public class ScopeController {

    private final
    RandomizeRequestScope randomizeRequestScope;

    private final
    RandomizeSessionScope randomizeSessionScope;

    @Autowired
    public ScopeController(RandomizeRequestScope randomizeRequestScope, RandomizeSessionScope randomizeSessionScope) {
        this.randomizeRequestScope = randomizeRequestScope;
        this.randomizeSessionScope = randomizeSessionScope;
    }

    @RequestMapping("/")
    public void getRandom(HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().write("Request scope <br>");
        httpServletResponse.getWriter().write("Old number " + randomizeRequestScope.getRandomNumber() + " <br>");
        randomizeRequestScope.generateRandomNumber();
        httpServletResponse.getWriter().write("New Number " + randomizeRequestScope.getRandomNumber() + " <br>");

        httpServletResponse.getWriter().write("Session Scope <br>");
        httpServletResponse.getWriter().write("Old number " + randomizeSessionScope.getRandomNumber() + " <br>");
        randomizeSessionScope.generateRandomNumber();
        httpServletResponse.getWriter().write("New number : " + randomizeSessionScope.getRandomNumber() + " <br>");
    }

    @RequestMapping("/test")
    public void test(HttpServletResponse response) throws Exception {
        response.getWriter().write("Testing the RequestMapping annotation");
    }

    @RequestMapping("/test1")
    public String test1() {
        return "index";
    }
}
