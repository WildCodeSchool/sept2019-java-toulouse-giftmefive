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
                         @RequestParam String url_article,
                         @RequestParam String gift_name,
                         @RequestParam String description_gift,
                         @RequestParam Integer preferences,
                         @RequestParam Double price){
        model.addAttribute("RegisterGifts", CreateGiftRepository.save(url_image, url_article,
                gift_name, description_gift, price));
        RegisterGifts save = new RegisterGifts(url_image, url_article, gift_name, description_gift, price);

        return "redirect:/listes-cadeaux";
    }
}
