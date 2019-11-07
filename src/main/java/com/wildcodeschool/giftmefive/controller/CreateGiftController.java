package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.RegisterGifts;
import com.wildcodeschool.giftmefive.repository.CreateGiftRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateGiftController {

    @PostMapping("/register-gifts")
    public String registerGifts (Model model,
                         @RequestParam String url_image,
                         @RequestParam String url_website,
                         @RequestParam String gift_name,
                         @RequestParam String description,
                         @RequestParam Integer preference,
                         @RequestParam Double price) {
        model.addAttribute("RegisterGifts", CreateGiftRepository.save(url_image, url_website,
                gift_name, description, preference, price));
        RegisterGifts save = new RegisterGifts(url_image, url_website, gift_name, description, preference, price);

        return "redirect:/index";
    }
}
