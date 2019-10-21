package com.wildcodeschool.giftmefive.model;

public class Gifts {


    private Long id;
    private String name;
    private String urlImage;
    private String urlArticle;
    private String description;
    private double price;


    public Gifts(Long id,String name, String url_image, String url_article, String description, double prix) {
        this.id = id;
        this.name = name;
        this.urlImage = url_image;
        this.urlArticle = url_article;
        this.description = description;
        this.price = prix;
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

    public String getUrl_image() {
        return urlImage;
    }

    public void setUrl_image(String url_image) {
        this.urlImage = url_image;
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
