package com.wildcodeschool.giftmefive.model;

public class ListGifts {

    private Long id;
    private String name;
    private String description;
    private String urlImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public ListGifts(Long id,String name, String description, String urlImage ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.urlImage = urlImage;
    }


}
