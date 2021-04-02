package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processFrom(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(
            HttpServletRequest request,
            Model model)
    {

        String theName = request.getParameter("studentName").toUpperCase();

        String result = "Yo " + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDude(
            @RequestParam("studentName") String theName,
            Model model)
    {

        String result = "Yo " + theName.toUpperCase();

        model.addAttribute("message", result);

        return "helloworld";
    }
}
