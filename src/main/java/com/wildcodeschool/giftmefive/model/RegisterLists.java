package com.wildcodeschool.giftmefive.model;

public class RegisterLists {

    private String list_name;
    private String description;
    private String url_image;

    public RegisterLists(String list_name, String description, String url_image) {
        this.list_name = list_name;
        this.description = description;
        this.url_image = url_image;
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
}
