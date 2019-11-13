package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.model.User;
import com.wildcodeschool.giftmefive.repository.CreateUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateUserController {

    private CreateUserRepository createUserRepository = new CreateUserRepository();

    @PostMapping("/sign-up")
    public String signUp(
                             @RequestParam String username,
                             @RequestParam String password,
                             @RequestParam String email,
                             @RequestParam Long idUser) {
       createUserRepository.save(username, password, email, idUser);

        return "redirect:/listes";
    }
}
