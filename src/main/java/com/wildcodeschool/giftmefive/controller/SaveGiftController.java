package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.RegisterGifts;
import com.wildcodeschool.giftmefive.repository.CreateGiftRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class SaveGiftController {

        @GetMapping("/description-cadeau")

        public String giftDescription(Model model, @RequestParam Long idList) {
            model.addAttribute()
            return "giftMaker";
        }
}
