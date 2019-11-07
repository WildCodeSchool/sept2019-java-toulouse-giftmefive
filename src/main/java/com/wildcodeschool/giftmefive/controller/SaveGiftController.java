package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.ListGiftsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class SaveGiftController {

        @GetMapping("/description-cadeau")
        public String giftDescription() {
            return "giftMaker";
        }
}
