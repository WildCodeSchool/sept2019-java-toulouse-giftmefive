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
    public String getGift(Model model, @RequestParam Long id, @RequestParam(defaultValue = "0") int filtre) {
        String sql = "SELECT * FROM gift WHERE id_list = ?;";
        boolean filtreAz = true;
        boolean filtrePrice = true;
        boolean filtrePreference = true;
        switch (filtre) {
            case 0:
                sql = "SELECT * FROM gift WHERE id_list = ?;";
                break;
            case 1:
                sql = "SELECT * FROM gift WHERE id_list = ? order by gift_name asc;";
                break;
            case 2:
                sql = "SELECT * FROM gift WHERE id_list = ? order by gift_name desc;";
                filtreAz = false;
                break;
            case 3:
                sql = "SELECT * FROM gift WHERE id_list = ? order by price desc;";
                filtrePrice = false;
                break;
            case 4:
                sql = "SELECT * FROM gift WHERE id_list = ? order by price asc;";
                break;
            case 5:
                sql = "SELECT * FROM gift WHERE id_list = ? order by preference asc;";
                break;
            case 6:
                sql = "SELECT * FROM gift WHERE id_list = ? order by preference desc;";
                filtrePreference = false;
                break;
            default:
        }
        ListGift listGift = listsRepository.findById(id);
        List<Gift> gifts = giftsRepository.findAllById(id, sql);
        model.addAttribute("gifts", gifts);
        model.addAttribute("list", listGift);
        model.addAttribute("filtreAz", filtreAz);
        model.addAttribute("filtrePrice", filtrePrice);
        model.addAttribute("filtrePreference", filtrePreference);
        return "gift-list";
    }

    @GetMapping("/gift/delete")
    public String deleteGift(@RequestParam Long id , @RequestParam Long idList) {

        giftsRepository.deleteGift(id);
        return "redirect:/cadeaux?id=" + idList;
    }

    @GetMapping("/cadeaux-ami")
    public String getFriendGift(Model model, @RequestParam Long id, @RequestParam(defaultValue = "0") int filtre) {
        String sql = "SELECT * FROM gift WHERE id_list = ?;";
        boolean filtreAz = true;
        boolean filtrePrice = true;
        boolean filtrePreference = true;
        boolean filtreOffert = true;
        switch (filtre) {
            case 0:
                sql = "SELECT * FROM gift WHERE id_list = ?;";
                break;
            case 1:
                sql = "SELECT * FROM gift WHERE id_list = ? order by gift_name asc;";
                break;
            case 2:
                sql = "SELECT * FROM gift WHERE id_list = ? order by gift_name desc;";
                filtreAz = false;
                break;
            case 3:
                sql = "SELECT * FROM gift WHERE id_list = ? order by price desc;";
                filtrePrice = false;
                break;
            case 4:
                sql = "SELECT * FROM gift WHERE id_list = ? order by price asc;";
                break;
            case 5:
                sql = "SELECT * FROM gift WHERE id_list = ? order by preference asc;";
                break;
            case 6:
                sql = "SELECT * FROM gift WHERE id_list = ? order by preference desc;";
                filtrePreference = false;
                break;
            case 7:
                sql = "SELECT * FROM gift WHERE id_list = ? and id_friend is null order by id_friend desc;";
                break;
            case 8:
                sql = "SELECT * FROM gift WHERE id_list = ? order by id_friend asc;";
                filtreOffert = false;
                break;
            default:
        }
        ListGift listGift = listsRepository.findById(id);
        List<Gift> gifts = giftsRepository.findAllById(id, sql);
        model.addAttribute("gifts", gifts);
        model.addAttribute("list", listGift);
        model.addAttribute("gifts", gifts);
        model.addAttribute("list", listGift);
        model.addAttribute("filtreAz", filtreAz);
        model.addAttribute("filtrePrice", filtrePrice);
        model.addAttribute("filtrePreference", filtrePreference);
        model.addAttribute("filtreOffert", filtreOffert);
        return "friends-view";
    }

    @GetMapping("/gift-modification")
    public String callUpdateGift(Model out, @RequestParam Long idGift) {
        out.addAttribute("Gift", giftsRepository.findById(idGift));
        return "gift-maker-update";
    }

    @GetMapping("/gift/update")
    public String updateGift(@RequestParam Long idGift, @RequestParam String giftName, @RequestParam String description,
                             @RequestParam float price, @RequestParam int preference, @RequestParam String urlImage,
                             @RequestParam String urlWebsite, @RequestParam Long idList) {
        giftsRepository.updateGift(idGift, giftName, description, price,preference,urlImage,urlWebsite);
        return "redirect:/cadeaux?id=" + idList;
    }

    @GetMapping("/gift-offert")
    public String UpdateGiftOffert(Model out, @RequestParam Long idGift, @RequestParam Long idUser,  @RequestParam Long idList) {
        giftsRepository.updateGiftOffert(idGift,idUser);
        return "redirect:/cadeaux-ami?id=" + idList ;
    }

}