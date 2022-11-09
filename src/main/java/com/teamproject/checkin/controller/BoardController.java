package com.teamproject.checkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    //기본부트스트랩
    @GetMapping("/freeBoard")
    public String FRboardList(Model model){
        return "/board/freeBoard";
    }
    
    @GetMapping("/FRWrite")
    public String FRWrite(Model model){
        return "/board/FRWrite";
    }

}
