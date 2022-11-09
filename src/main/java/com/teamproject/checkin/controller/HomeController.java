package com.teamproject.checkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본부트스트랩
    @GetMapping("/home")
    public String home1(Model model){
        return "home";
    }
    
    @GetMapping("/")
    public String home(Model model){
        return "home";
    }
}
