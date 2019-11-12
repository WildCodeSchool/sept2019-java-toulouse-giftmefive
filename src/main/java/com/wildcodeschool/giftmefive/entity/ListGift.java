package com.wildcodeschool.giftmefive.entity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ListGift {
    private long idList;
    private String listName;
    private String description;
    private String urlImage;
    private String urlShare;
    private long idUser;
    @OneToOne(mappedBy = "listGift")
    @JoinColumn(unique = true)
    private Gift gift;

    public ListGift(long idList, String listName, String description, String urlImage, String urlShare, long idUser) {
        this.idList = idList;
        this.listName = listName;
        this.description = description;
        this.urlImage = urlImage;
        this.urlShare = urlShare;
        this.idUser = idUser;
    }

    public long getIdList() {
        return idList;
    }

    public void setIdList(long idList) {
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

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
}
