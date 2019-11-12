package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.entity.Gift;
import com.wildcodeschool.giftmefive.entity.ListGift;
import com.wildcodeschool.giftmefive.model.RegisterGifts;
import com.wildcodeschool.giftmefive.repository.CreateGiftRepository;
import com.wildcodeschool.giftmefive.repository.ListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateGiftController {

    private ListsRepository listsRepository = new ListsRepository();
    private CreateGiftRepository createGiftRepository = new CreateGiftRepository();

    @GetMapping("/description-cadeau")
    public String giftDescription(Model model,
                                  @RequestParam Long id) {
        model.addAttribute("listId", id);
        return "giftMaker";
    }

    @PostMapping("/register-gifts")
    public String registerGifts(
                                @RequestParam String urlImage,
                                @RequestParam String urlWebsite,
                                @RequestParam String giftName,
                                @RequestParam String description,
                                @RequestParam Integer preference,
                                @RequestParam Double price,
                                @RequestParam Long idList) {
        createGiftRepository.save(urlImage, urlWebsite,
                giftName, description, preference, price, idList);

        return "redirect:/cadeaux?id=" + idList;
    }
}