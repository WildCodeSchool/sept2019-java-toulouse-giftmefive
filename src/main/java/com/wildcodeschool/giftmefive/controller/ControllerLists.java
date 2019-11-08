package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.ListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerLists {

    private ListsRepository listsRepository = new ListsRepository();
    @GetMapping("/listes")
    public String getList(Model model) {
        model.addAttribute("lists", listsRepository.findAll());
        return "lists";
    }
    @GetMapping("/listes/delete")
    public String deleteList(@RequestParam int id) {
        listsRepository.deleteGiftFromList(id);
        listsRepository.deleteList(id);
        return "redirect:/listes";
    }
}