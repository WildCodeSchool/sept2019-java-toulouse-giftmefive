package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescriptionListController {
    @GetMapping("/descriptionList")
    public String descriptionListe() {
        return "descriptionListe.html";
    }
}
