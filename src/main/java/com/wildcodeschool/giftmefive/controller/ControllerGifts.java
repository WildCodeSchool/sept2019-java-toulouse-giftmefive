package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.entity.Gift;
import com.wildcodeschool.giftmefive.entity.ListGift;
import com.wildcodeschool.giftmefive.repository.GiftsRepository;
import com.wildcodeschool.giftmefive.repository.ListsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ControllerGifts {

    private GiftsRepository giftsRepository = new GiftsRepository();
    private ListsRepository listsRepository = new ListsRepository();

    @GetMapping("/cadeaux")
    public String getGift(Model model, @RequestParam Long id) {
        ListGift listGift = listsRepository.findById(id);
        List<Gift> gifts = giftsRepository.findAllById(id);
        model.addAttribute("gifts", gifts);
        model.addAttribute("list", listGift);
        return "gift-list";
    }
    @GetMapping("/gift/delete")
    public String deleteGift(@RequestParam Long id , @RequestParam Long idList) {
        giftsRepository.deleteGift(id);
        return "redirect:/cadeaux?id=" + idList;
    }
    @GetMapping("/cadeaux-ami")
    public String getFriendGift(Model model, @RequestParam Long id) {
        ListGift listGift = listsRepository.findById(id);
        List<Gift> gifts = giftsRepository.findAllById(id);
        model.addAttribute("gifts", gifts);
        model.addAttribute("list", listGift);
        return "friends-view";
    }
}
