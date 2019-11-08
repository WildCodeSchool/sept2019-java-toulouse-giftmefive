package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class signUpController {
    @GetMapping("/inscription")
    public String callSignIn() {
        return "signUp.html";
    }
}