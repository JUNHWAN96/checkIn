package com.teamproject.checkin.checkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "test";
    }

    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "index";
    }

    @GetMapping("/hihi")
    public String hihi(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "hihi";
    }

    @GetMapping("/layout")
    public String layout(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "/layout/layout";
    }

}
