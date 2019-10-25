package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.ListGiftsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListGiftController {
    @PostMapping("/register-list")
    public String registerList
            (@RequestParam(name = "urlImage", required = false, defaultValue = "http") String urlImage,
             @RequestParam(name = "listName", required = false) String listName,
             @RequestParam(name = "descriptionList", required = false) String descriptionList) {
        ListGiftsRepository repository = new ListGiftsRepository();
        ListGiftsRepository.registerInList(urlImage, listName, descriptionList);
        return "/index";
        // TODO Ajout Lien de la page de nouvelleListe
    }
    @GetMapping("/register-list")
    public String showListForm(){
        return "listMaker";
    }
}
