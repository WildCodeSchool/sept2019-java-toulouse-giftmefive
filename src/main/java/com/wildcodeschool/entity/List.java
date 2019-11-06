package com.wildcodeschool.entity;

public class List {
    private int id_list;
    private String list_name;
    private String description;
    private String url_image;
    private String url_share;
    private int id_user;

    public List(int id_list, String list_name, String description, String url_image, String url_share, int id_user) {
        this.id_list = id_list;
        this.list_name = list_name;
        this.description = description;
        this.url_image = url_image;
        this.url_share = url_share;
        this.id_user = id_user;
    }

    public int getId_list() {
        return id_list;
    }

    public void setId_list(int id_list) {
        this.id_list = id_list;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public String getUrl_share() {
        return url_share;
    }

    public void setUrl_share(String url_share) {
        this.url_share = url_share;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
