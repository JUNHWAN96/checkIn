package com.teamproject.checkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    //기본부트스트랩
    @GetMapping("/test")
    public String test(Model model){

        return "test";
    }

    //부트스트랩 틀
    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "index";
    }

    //헤더푸터 제거
    @GetMapping("/index2")
    public String index2(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "index2";
    }

    //부트스트랩 틀
    @GetMapping("/hihi")
    public String hihi(Model model){

        model.addAttribute("data","타임리프 테스트");
        return "hihi";
    }
    
    @GetMapping("/template")
    public String template(Model model) {
    	  model.addAttribute("data","타임리프 테스트");
          return "template";
    }
    
    @GetMapping("/table")
    public String table(Model model) {
    	model.addAttribute("data", "UI 화면 테스트");
    	return "table";
    }

    @GetMapping("/table2")
    public String table2(Model model) {
        model.addAttribute("data", "UI 화면 테스트");
        return "/table/table1234";
    }
}
