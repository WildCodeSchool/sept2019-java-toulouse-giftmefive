package com.wildcodeschool.giftmefive.model;

public class ListGifts {
    private int id;
    private String listName;
    private String description;
    private String urlImage;

    public ListGifts(int id, String listName, String description, String urlImage) {
        this.id = id;
        this.listName = listName;
        this.description = description;
        this.urlImage = urlImage;
    }

    public String getName() {
        return listName;
    }

    public void setName(String listName) {
        this.listName = listName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
