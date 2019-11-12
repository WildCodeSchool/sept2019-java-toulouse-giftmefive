package com.wildcodeschool.giftmefive.entity;

public class User {
    private long idUser;
    private String username;
    private String password;
    private String email;

    public User(long idUser, String username, String password, String email) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
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
}