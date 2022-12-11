package com.teamproject.checkin.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserAccountController {

    private final UserAccountService userAccountService;

    @GetMapping("/register")
    public String registerForm (){
        return "/user/register";
    }

    @PostMapping("/register")
    public String register(UserAccountDto userAccountDto){

        userAccountService.saveUser(userAccountDto);

        return "/user/login";

    }

    @GetMapping("/login")
    public String login(){
        return "/user/login";
    }

}
