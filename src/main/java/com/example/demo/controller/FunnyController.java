package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funny")
public class FunnyController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
}
