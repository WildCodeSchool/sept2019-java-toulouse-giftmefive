package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListDescriptionController {
    @GetMapping("/list-description")
    public String listDescription() {
        return "listMaker.html";
    }
}
