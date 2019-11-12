package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.entity.User;
import com.wildcodeschool.giftmefive.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


    @Controller
    public class UserController{

        private UserRepository userRepository = new UserRepository();
        private UserRepository repository = new UserRepository();

        @GetMapping("/identification")
        public String callSign() {
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

        @GetMapping("/inscription")
        public String callSignIn() {
            return "signUp.html";
        }

        @GetMapping("/modification")
        public String callUserUdapte(Model out) {
            //Todo methode recherche user connecté

            return "user-update";
        }

        @PostMapping("/enregistre_user")
        public String userUpdate(Model out,

                                 @RequestParam Long idUser,
                                 @RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String passwordConfirmation,
                                 @RequestParam String email
        ) {
            if (!password.equals(passwordConfirmation)) {
                return "redirect:/modification";
            }
            out.addAttribute("user", repository.save(idUser, username, password, email));
            return "redirect:/";
        }
    }