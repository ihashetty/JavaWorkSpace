package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {

    @RequestMapping("/home")
    public String home(){
        return "Home.html";//this will render home page
    }
    @RequestMapping("/aboutUs")
    public String aboutUs()
    {
        return "aboutUs.html";
    }

}
