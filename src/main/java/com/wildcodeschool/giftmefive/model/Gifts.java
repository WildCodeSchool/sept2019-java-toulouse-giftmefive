package com.wildcodeschool.giftmefive.model;

public class Gifts {
    private Long id;
    private Long listGiftsId;
    private String name;
    private String urlImage;
    private String urlArticle;
    private String description;
    private double price;

    public Gifts(Long id, Long listGiftsId, String name, String urlImage, String urlArticle, String description, double price) {
        this.id = id;
        this.listGiftsId=listGiftsId;
        this.name = name;
        this.urlImage = urlImage;
        this.urlArticle = urlArticle;
        this.description = description;
        this.price = price;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Long getListGiftsId() {
        return listGiftsId;
    }

    public void setListGiftsId(Long listGiftsId) {
        this.listGiftsId = listGiftsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlArticle() {
        return urlArticle;
    }

    public void setUrlArticle(String urlArticle) {
        this.urlArticle = urlArticle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
