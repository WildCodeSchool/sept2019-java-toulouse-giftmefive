package com.wildcodeschool.giftmefive.model;
public class RegisterGifts {

    private Long idGift;
    private String urlImage;
    private String urlWebsite;
    private String giftName;
    private String description;
    private Integer preference;
    private Double price;
    private Long idList;

    public RegisterGifts(Long idGift, String urlImage, String urlWebsite, String giftName, String description,
                         Integer preference, Double price, Long idList) {

        this.urlImage = urlImage;
        this.urlWebsite = urlWebsite;
        this.giftName = giftName;
        this.description = description;
        this.preference = preference;
        this.price = price;
        this.idList = idList;
        this.idGift = idGift;
    }

    public Long getIdGift() { return idGift; }

    public void setIdGift(Long idGift) {
        this.idGift = idGift;
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

    public Integer getPreference() {
        return preference;
    }

    public void setPreference(Integer preference) {
        this.preference = preference;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getIdList() {
        return idList;
    }

    public void setIdList(Long idList) {
        this.idList = idList;
    }
}