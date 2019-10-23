package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.ListGifts;
import com.wildcodeschool.giftmefive.repository.ListGiftsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListGiftController {
    @GetMapping("/registerList")
    public String registerList
            (@RequestParam(name="urlImage", required = false, defaultValue = "http") String urlImage,
             @RequestParam(name = "listName", required = true) String listName,
             @RequestParam(name = "descriptifList", required = true) String descriptifList) {
        ListGiftsRepository repository = new ListGiftsRepository();
        repository.registerInList(urlImage, listName, descriptifList);
        return "/";
        // TODO Ajout Lien de la page de nouvelleListe
    }
}
