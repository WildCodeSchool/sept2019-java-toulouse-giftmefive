package com.wildcodeschool.giftmefive.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
    public class SaveGiftController {

        @GetMapping("/description-cadeau")

        public String giftDescription() {
            return "giftMaker";
        }
}