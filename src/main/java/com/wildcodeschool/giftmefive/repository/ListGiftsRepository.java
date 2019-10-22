package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.model.ListGifts;

import java.util.ArrayList;
import java.util.List;

public class ListGiftsRepository {

    //Recherche toute les liste de cadeau
    public List<ListGifts> findAll() {

        return myList;
    }

    //recherche une liste de cadeau
    public ListGifts findById(Long id) {
        for (ListGifts listGifts : myList) {
            if (id.equals(listGifts.getId())) {
                return listGifts;
            }
        }
        return null;
    }

    // liste template
    private static List<ListGifts> myList = new ArrayList<ListGifts>() {
        {
            add(new ListGifts(1L, "Noel", "Mes cadeaux de reve", "http://via.placeholder.com/540x260"));
            add(new ListGifts(2L, "Aniv", "Mes cadeaux", "http://via.placeholder.com/540x260"));
        }
    };

}