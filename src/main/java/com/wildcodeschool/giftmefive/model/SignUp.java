package com.wildcodeschool.giftmefive.model;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class SignUp {

    private String username;
    private String password;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private RegisterGifts gift;

    public SignUp(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gift = gift;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegisterGifts getGift() {
        return gift;
    }

    public void setGift(RegisterGifts gift) {
        this.gift = gift;
    }
}