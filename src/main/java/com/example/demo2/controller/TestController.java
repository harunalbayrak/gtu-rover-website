package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {
    @GetMapping("/")
    public String start(Model model){
        Deneme deneme = new Deneme(3);
        List<InstagramPhoto> instagramPhotos = deneme.getInstagramPhotos();
        model.addAttribute("instagramPhotos",instagramPhotos);
        return "index";
    }

    @GetMapping("/insta")
    public String insta(Model model){
        Deneme deneme = new Deneme(3);
        List<InstagramPhoto> instagramPhotos = deneme.getInstagramPhotos();
        model.addAttribute("instagramPhotos",instagramPhotos);
        return "insta";
    }
}
