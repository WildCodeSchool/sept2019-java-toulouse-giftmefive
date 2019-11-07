package com.wildcodeschool.giftmefive.model;

public class RegisterGifts {

    private String url_image;
    private String url_article;
    private String gift_name;
    private String description_gift;
    private int price;

    public RegisterGifts(String url_image, String url_article, String gift_name, String description_gift, int price) {
        this.url_image = url_image;
        this.url_article = url_article;
        this.gift_name = gift_name;
        this.description_gift = description_gift;
        this.price = price;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public String getUrl_article() {
        return url_article;
    }

    public void setUrl_article(String url_article) {
        this.url_article = url_article;
    }

    public String getGift_name() {
        return gift_name;
    }

    public void setGift_name(String gift_name) {
        this.gift_name = gift_name;
    }

    public String getDescription_gift() {
        return description_gift;
    }

    public void setDescription_gift(String description_gift) {
        this.description_gift = description_gift;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
