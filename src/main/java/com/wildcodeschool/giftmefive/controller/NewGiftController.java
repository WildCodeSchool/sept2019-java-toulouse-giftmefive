package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.ListGiftsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class NewGiftController {
    @GetMapping("/registerGift")
    public String registerGift
            (@RequestParam(name="urlImage", required = false, defaultValue = "http") String urlImage,
             @RequestParam(name="urlArticle", required = false, defaultValue = "http") String urlArticle,
             @RequestParam(name = "giftName", required = true) String giftName,
             @RequestParam(name = "descriptifGift", required = true) String description,
             @RequestParam(name = "price", required = true) int price) {
        ListGiftsRepository repository = new ListGiftsRepository();
        repository.registerInList(urlImage, giftName, description);
        return "/";
    }
        // TODO Ajout Lien de la page de nouveauCadeau
}
