package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CricketController {
    @RequestMapping("/Cricketers")
    public String ListOfCricketers()
    {
        return "Cricketers.html";
    }
    @RequestMapping("/AboutUs")
    public String AboutCricket()
    {
        return "aboutUs.html";
    }

}
