package com.wildcodeschool.giftmefive.repository;
import com.wildcodeschool.giftmefive.model.ListGifts;
import java.util.ArrayList;
import java.util.List;

public class ListGiftsRepository {

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
            add(new ListGifts(1L, "Noel", "Mes cadeaux de reve", "http://via.placeholder.com/540x260"));
            add(new ListGifts(2L, "Aniv", "Mes cadeaux", "http://via.placeholder.com/540x260"));
        }
    };

    public static void registerInList (String name, String description, String urlImage) {
        Long id = myList.size()+1L;
        myList.add(new ListGifts(id, name, description, urlImage));
    }
}