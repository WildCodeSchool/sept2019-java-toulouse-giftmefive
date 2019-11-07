package com.wildcodeschool.giftmefive.model;

public class RegisterGifts {

    private String url_image;
    private String url_website;
    private String gift_name;
    private String description;
    private Integer preference;
    private Double price;

    public RegisterGifts(String url_image, String url_website, String gift_name, String description, Integer preferences, Double price) {
        this.url_image = url_image;
        this.url_website = url_website;
        this.gift_name = gift_name;
        this.description = description;
        this.preference = preferences;
        this.price = price;
    }

    public String getUrl_image() {

        return url_image;
    }

    public void setUrl_image(String url_image) {

        this.url_image = url_image;
    }

    public String getUrl_website() {

        return url_website;
    }

    public void setUrl_website(String url_website) {

        this.url_website = url_website;
    }

    public String getGift_name() {

        return gift_name;
    }

    public void setGift_name(String gift_name) {

        this.gift_name = gift_name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getPreferences() {

        return preference;
    }

    public void setPreferences(Integer preferences) {

        this.preference = preferences;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }
}
