package com.sanjay.SpringB_PaymentApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {



    @GetMapping("/")
    public String init(){
        return "index";
    }

}
