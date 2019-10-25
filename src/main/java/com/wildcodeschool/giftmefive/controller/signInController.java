package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class signInController {
    @GetMapping("/identification")
    public String callSignIn() {
        return "signIn.html";
    }
}
