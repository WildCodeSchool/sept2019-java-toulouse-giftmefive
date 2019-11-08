package com.wildcodeschool.giftmefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaveListController {

    @GetMapping("/description-liste")
    public String showListForm(){
        return "listMaker";
    }
}
