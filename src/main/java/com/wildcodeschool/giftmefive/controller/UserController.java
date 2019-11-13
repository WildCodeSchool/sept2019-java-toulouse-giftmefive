package com.wildcodeschool.giftmefive.controller;

import com.wildcodeschool.giftmefive.entity.User;
import com.wildcodeschool.giftmefive.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    private UserRepository repository = new UserRepository();

    @PostMapping("/connexion")
    public String connexion(HttpSession session, @RequestParam String username, @RequestParam String password) {
        User user = repository.getByUsername(username, password);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/";
        }
        return "signIn";
    }

    @GetMapping("se-deconnecter")
    public String deconnection(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "index";
    }

    @GetMapping("/identification")
    public String callSign() {
        return "signIn";
    }

    @GetMapping("/inscription")
    public String callSignIn() {
        return "signUp.html";
    }

    @GetMapping("/modification")
    public String callUserUdapte(Model out, @RequestParam Long id) {
        out.addAttribute("User", repository.findById(id));
        return "user-update";
    }

    @PostMapping("/enregistre_user")
    public String userUpdate(Model out,
                             @RequestParam Long idUser,
                             @RequestParam String username,
                             @RequestParam String password,
                             @RequestParam String passwordConfirmation,
                             @RequestParam String email
    ) {
        if (!password.equals(passwordConfirmation)) {
            return "redirect:/modification?id=" + idUser;
        }
        out.addAttribute("user", repository.save(idUser, username, password, email));
        return "redirect:/modification?id=" + idUser;
    }
}

