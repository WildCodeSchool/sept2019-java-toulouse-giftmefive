package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.GiftsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGifts {

    private GiftsRepository giftsRepository = new GiftsRepository();

    @GetMapping("/gifts")
    public String getList(Model model) {

        model.addAttribute("gifts", giftsRepository.findAll());

        return "gift-list";
    }
}
