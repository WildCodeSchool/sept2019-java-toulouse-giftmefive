package com.wildcodeschool.giftmefive.controller;
import com.wildcodeschool.giftmefive.repository.CreateListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateListsController {

    private CreateListsRepository createListsRepository = new CreateListsRepository();

    @PostMapping("/register-lists")
    public String signUp(
                         @RequestParam String listName,
                         @RequestParam String urlImage,
                         @RequestParam String description,
                         @RequestParam Long idUser) {
        createListsRepository.save(listName, urlImage,
                description, idUser);

        return "redirect:/listes";
    }
}
