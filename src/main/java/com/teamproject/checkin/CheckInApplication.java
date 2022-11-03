package com.teamproject.checkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CheckInApplication {

    @RequestMapping("/")
    public String home(){
        return "hello SpringBoot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CheckInApplication.class, args);
    }

}
