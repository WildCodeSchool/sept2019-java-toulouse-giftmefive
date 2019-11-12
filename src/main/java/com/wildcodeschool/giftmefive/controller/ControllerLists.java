package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.repository.ListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerLists {

    private ListsRepository listsRepository = new ListsRepository();

    @GetMapping("/listes")
    public String getList(Model model, @RequestParam Long id) {
        model.addAttribute("lists", listsRepository.findAll(id));
        return "lists";
    }

    @GetMapping("/listes/delete")
    public String deleteList(@RequestParam Long id, @RequestParam Long idUser) {

        listsRepository.deleteGiftFromList(id);
        listsRepository.deleteList(id);
        return "redirect:/listes?id=" + idUser;
    }

    @GetMapping("/listes-modification")
    public String callUpdateList(Model out, @RequestParam Long idList) {
        out.addAttribute("List", listsRepository.findById(idList));
        return "list-maker-update";
    }

    @GetMapping("/listes/update")
    public String updateList(@RequestParam Long idList, @RequestParam String urlImage, @RequestParam String listName,
                             @RequestParam String descriptionList, @RequestParam Long idUser) {
        listsRepository.updateList(idList, listName, descriptionList, urlImage);
        return "redirect:/listes?id=" + idUser;
    }
}