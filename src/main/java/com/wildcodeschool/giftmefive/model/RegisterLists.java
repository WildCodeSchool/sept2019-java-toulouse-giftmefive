package com.wildcodeschool.giftmefive.model;

public class RegisterLists {

    private String listName;
    private String description;
    private String urlImage;
    private Long idUser;

    public RegisterLists(String listName, String description, String urlImage, Long idUser) {
        this.listName = listName;
        this.description = description;
        this.urlImage = urlImage;
        this.idUser = idUser;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
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

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
