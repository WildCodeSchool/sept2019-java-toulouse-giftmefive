package com.wildcodeschool.giftmefive.entity;

public class ListGift {
    private Long idList;
    private String listName;
    private String description;
    private String urlImage;
    private String urlShare;
    private Long idUser;

    public ListGift(Long idList, String listName, String description, String urlImage, String urlShare, Long idUser) {
        this.idList = idList;
        this.listName = listName;
        this.description = description;
        this.urlImage = urlImage;
        this.urlShare = urlShare;
        this.idUser = idUser;
    }

    public Long getIdList() {
        return idList;
    }

    public void setIdList(Long idList) {
        this.idList = idList;
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

    public String getUrlShare() {
        return urlShare;
    }

    public void setUrlShare(String urlShare) {
        this.urlShare = urlShare;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
