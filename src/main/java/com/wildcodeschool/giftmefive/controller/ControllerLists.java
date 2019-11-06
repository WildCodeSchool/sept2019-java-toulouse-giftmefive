package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.ListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLists {

    private ListsRepository listsRepository = new ListsRepository();

    @GetMapping("/listes")
    public String getList(Model model) {
        model.addAttribute("lists", listsRepository.findAll());
        return "lists";
    }

}
