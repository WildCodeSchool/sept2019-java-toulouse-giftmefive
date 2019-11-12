package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.RegisterGifts;
import com.wildcodeschool.giftmefive.repository.CreateGiftRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateGiftController {

    @PostMapping("/register-gifts")
    public String registerGifts(Model model,
                                @RequestParam String urlImage,
                                @RequestParam String urlWebsite,
                                @RequestParam String giftName,
                                @RequestParam String description,
                                @RequestParam Integer preference,
                                @RequestParam Double price,
                                @RequestParam int idList) {
        model.addAttribute("RegisterGifts", CreateGiftRepository.save(urlImage, urlWebsite,
                giftName, description, preference, price, idList));
        RegisterGifts save = new RegisterGifts(urlImage, urlWebsite, giftName, description, preference, price, idList);

        return "redirect:/index";
    }
}
