package com.wildcodeschool.giftmefive.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Gift {
    private long idGift;
    private String giftName;
    private String description;
    private float price;
    private int preference;
    private String urlImage;
    private String urlWebsite;
    private long idList;
    private long idFriend;

    public Gift(Long idGift, String giftName, String description, float price, int preference, String urlImage,
                String urlWebsite, Long idList, Long idFriend) {

        this.idGift = idGift;
        this.giftName = giftName;
        this.description = description;
        this.price = price;
        this.preference = preference;
        this.urlImage = urlImage;
        this.urlWebsite = urlWebsite;
        this.idList = idList;
        this.idFriend = idFriend;
    }

    public long getIdGift() {
        return idGift;
    }

    public void setIdGift(long idGift) {
        this.idGift = idGift;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlWebsite() {
        return urlWebsite;
    }

    public void setUrlWebsite(String urlWebsite) {
        this.urlWebsite = urlWebsite;
    }

    public long getIdList() {
        return idList;
    }

    public void setIdList(long idList) {
        this.idList = idList;
    }

    public long getIdFriend() {
        return idFriend;
    }

    public void setIdFriend(long idFriend) {
        this.idFriend = idFriend;
    }
}