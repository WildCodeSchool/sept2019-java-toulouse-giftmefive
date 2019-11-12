package com.wildcodeschool.giftmefive.model;

import javax.persistence.*;
import java.util.List;

public class SignUp {

    private String username;
    private String password;
    private String email;
    private long idUser;

    public SignUp(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.idUser = idUser;
        this.lists = lists;
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

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public List<RegisterLists> getLists() {
        return lists;
    }

    public void setLists(List<RegisterLists> lists) {
        this.lists = lists;
    }
}