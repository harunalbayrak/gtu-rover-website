package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String start(){
        return "index";
    }

    @GetMapping("/members")
    public String membersPage() {
        return "members";
    }

    @GetMapping("/about-us")
    public String aboutUsPage() {
        return "aboutUs";
    }
}
