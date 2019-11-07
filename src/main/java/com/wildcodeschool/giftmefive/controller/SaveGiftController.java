package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class SaveGiftController {
    @PostMapping("/listes")
    public String registerGift
            (@RequestParam(name = "urlImage", required = false, defaultValue = "http") String urlImage,
             @RequestParam(name = "urlArticle", required = false, defaultValue = "http") String urlArticle,
             @RequestParam(name = "giftName", required = true) String giftName,
             @RequestParam(name = "descriptionGift", required = true) String description,
             @RequestParam(name = "price", required = true) int price) {
        return "/";
    }
        @GetMapping("/description-cadeau")
        public String giftDescription() {
            return "giftMaker";
        }
}