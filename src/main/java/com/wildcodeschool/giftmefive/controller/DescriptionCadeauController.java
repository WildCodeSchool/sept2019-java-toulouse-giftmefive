package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescriptionCadeauController {
    @GetMapping("/descriptionCadeau")
    public String descriptionListe() {
        return "descriptionCadeau.html";
    }
}
