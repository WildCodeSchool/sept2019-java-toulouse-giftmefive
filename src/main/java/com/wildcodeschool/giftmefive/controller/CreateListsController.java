package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.RegisterLists;
import com.wildcodeschool.giftmefive.repository.CreateListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateListsController {

    @PostMapping("/register-lists")
    public String signUp(Model model,
                         @RequestParam String list_name,
                         @RequestParam String url_image,
                         @RequestParam String description) {
        model.addAttribute("SignUp", CreateListsRepository.save(list_name, url_image,
                description));
        RegisterLists save = new RegisterLists(list_name, url_image, description);

        return "redirect:/listes-cadeaux";
    }
}
