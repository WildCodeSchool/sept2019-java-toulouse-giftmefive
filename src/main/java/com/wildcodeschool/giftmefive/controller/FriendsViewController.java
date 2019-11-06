package com.wildcodeschool.giftmefive.controller;
import com.wildcodeschool.giftmefive.repository.GiftsRepository;
import com.wildcodeschool.giftmefive.repository.ListGiftsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendsViewController {

    @GetMapping("/liste-partage")
    public String friendsView(Model out, @RequestParam(name = "id-liste", defaultValue = "1", required = false) Long id) {
        GiftsRepository repository = new GiftsRepository();
        ListGiftsRepository repo = new ListGiftsRepository();
        out.addAttribute("gifts", repository.findByListGiftsId(id));
        out.addAttribute("nameList",repo.findById(id));

        return "friends-view";
    }
}
