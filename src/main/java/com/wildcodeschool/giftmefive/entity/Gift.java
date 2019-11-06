package com.wildcodeschool.giftmefive.entity;

public class Gift {
    private int id_gift;
    private String gift_name;
    private String description;
    private float price;
    private int preference;
    private String url_image;
    private String url_website;
    private int id_list;
    private int id_friend;

    public Gift(int id_gift, String gift_name, String description, float price, int preference, String url_image,
                String url_website, int id_list, int id_friend) {
        this.id_gift = id_gift;
        this.gift_name = gift_name;
        this.description = description;
        this.price = price;
        this.preference = preference;
        this.url_image = url_image;
        this.url_website = url_website;
        this.id_list = id_list;
        this.id_friend = id_friend;
    }

    public int getId_gift() {
        return id_gift;
    }

    public void setId_gift(int id_gift) {
        this.id_gift = id_gift;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPreference() {
        return preference;
    }

    public void setPreference(int preference) {
        this.preference = preference;
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

    public int getId_list() {
        return id_list;
    }

    public void setId_list(int id_list) {
        this.id_list = id_list;
    }

    public int getId_friend() {
        return id_friend;
    }

    public void setId_friend(int id_friend) {
        this.id_friend = id_friend;
    }
}
