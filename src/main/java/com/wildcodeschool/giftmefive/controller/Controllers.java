package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/partager-liste")
    public String listsharing() {
        return "listsharing";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
}