/*
package com.wildcodeschool.giftmefive.controller;
import com.wildcodeschool.giftmefive.repository.GiftsRepository;
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
        out.addAttribute("gifts", repository.findByListGiftsId(id));

        return "friends-view";
    }
}
*/
