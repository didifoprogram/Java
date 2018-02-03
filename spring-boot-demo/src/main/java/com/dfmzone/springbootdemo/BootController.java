package com.dfmzone.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Random;


@Controller
public class BootController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("title", "WELCOME");
        model.put("message", "THIS IS A MESSAGE");

        return "index";
    }
}
