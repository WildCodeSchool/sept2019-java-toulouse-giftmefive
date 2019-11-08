package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.entity.User;
import com.wildcodeschool.giftmefive.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {

    @Controller
    public class signInController {
        UserRepository userRepository = new UserRepository();
        @GetMapping("/identification")
        public String callSignIn() {
            return "signIn.html";
        }

        @PostMapping("/connexion")
        public String connexion(@RequestParam String username, @RequestParam String password) {
            User user = userRepository.getByUsername(username, password);
            if (user != null) {
                return "redirect:/";
            }
            return "signIn";
        }
    }

    @Controller
    public class signUpController {
        @GetMapping("/inscription")
        public String callSignIn() {
            return "signUp.html";
        }
    }
}