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

    @GetMapping("/listes")
    public String list() {
        return "lists";
    }

    @GetMapping("/listes-cadeaux")
    public String giftList() {
        return "gift-list";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
}


