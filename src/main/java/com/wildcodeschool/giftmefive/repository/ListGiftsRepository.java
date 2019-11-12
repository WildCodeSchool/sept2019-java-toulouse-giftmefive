package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.model.ListGifts;

import java.util.ArrayList;
import java.util.List;

public class ListGiftsRepository {

    public static void registerInList(String name, String description, String urlImage) {
        Long id = myList.size() + 1L;
    }

    public List<ListGifts> findAll() {
        return myList;
    }

    public ListGifts findById(Long id) {
        for (ListGifts listGifts : myList) {
            if (id.equals(listGifts.getId())) {
                return listGifts;
            }
        }
        return null;
    }

    private static List<ListGifts> myList = new ArrayList<ListGifts>() {
        {
        }
    };

}