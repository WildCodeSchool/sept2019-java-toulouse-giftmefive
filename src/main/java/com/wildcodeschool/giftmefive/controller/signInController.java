package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class signInController {
    @GetMapping("/signIn")
    public String callSignIn() {
        return "signIn.html";
    }
}
