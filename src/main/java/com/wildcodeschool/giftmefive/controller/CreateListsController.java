package com.wildcodeschool.giftmefive.controller;
import com.wildcodeschool.giftmefive.repository.CreateListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateListsController {

    private CreateListsRepository createListsRepository = new CreateListsRepository();

    @GetMapping("/liste")
    public String giftDescription(Model model,
                                  @RequestParam Long idUser) {
        model.addAttribute("userId", idUser);
        return "listMaker";
    }

    @PostMapping("/register-lists")
    public String signUp(
            @RequestParam String listName,
            @RequestParam(defaultValue = "https://images.unsplash.com/photo-1549465220-1a8b9238cd48?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80") String urlImage,
            @RequestParam String description,
            @RequestParam Long idUser) {
        createListsRepository.save(listName,
                description, urlImage, idUser);

        return "redirect:/listes?id=" + idUser;
    }
}
