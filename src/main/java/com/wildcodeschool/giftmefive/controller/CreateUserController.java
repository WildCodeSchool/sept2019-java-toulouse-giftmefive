package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.User;
import com.wildcodeschool.giftmefive.repository.CreateUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateUserController {

    @PostMapping("/sign-up")
    public String signUp(Model model,
                             @RequestParam String username,
                             @RequestParam String password,
                             @RequestParam String email) {
        model.addAttribute("SignUp", CreateUserRepository.save(username, password,
                email));
        User save = new User(username, password, email);

        return "redirect:/listes";
    }
}
