package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        theModel.addAttribute("student", new Student());

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processFrom(@ModelAttribute("student") Student student){

        System.out.println(student.getFirstName() + " " + student.getLastName());

        return "student-confirmation";
    }
}
