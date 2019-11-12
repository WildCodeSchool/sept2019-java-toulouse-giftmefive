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
    public String deleteList(@RequestParam Long id) {
        listsRepository.deleteGiftFromList(id);
        listsRepository.deleteList(id);
        return "redirect:/listes";
    }

    @GetMapping("/listes-modification")
    public String callUpdateList(Model out,@RequestParam Long idList) {
        out.addAttribute("List", listsRepository.findById(idList));
        return "list-maker-update";
    }

    @GetMapping("/listes/update")
    public String updateList(@RequestParam Long idList,@RequestParam String urlImage,@RequestParam String listName,
                             @RequestParam String descriptionList) {
        listsRepository.updateList(idList,listName,descriptionList,urlImage);
        return "redirect:/listes";
    }
}