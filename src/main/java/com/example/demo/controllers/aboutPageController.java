package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutPageController {

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
