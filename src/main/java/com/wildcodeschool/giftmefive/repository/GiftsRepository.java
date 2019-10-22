package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.model.Gifts;

import java.util.ArrayList;
import java.util.List;

public class GiftsRepository {

    // recherche tous les cadeaux
    public List<Gifts> findAll() {
        return giftsList;
    }

    // recherche un cadeau par id
    public Gifts findById(Long id) {
        for (Gifts gifts : giftsList) {
            if (id.equals(gifts.getId())) {
                return gifts;
            }
        }
        return null;
    }

    //recherche les cadeaux d'une liste
    public List<Gifts> findByListGiftsId(Long id) {
        List<Gifts> myGifts= new ArrayList<>();
        for (Gifts gifts : giftsList) {
            if (id.equals(gifts.getListGiftsId())) {
                myGifts.add(gifts);
            }
        }
        return myGifts;
    }

    // liste template
    private static List<Gifts> giftsList = new ArrayList<Gifts>() {{
        add(new Gifts(1L, 1L, "Truc 1", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 1L, "Machin 2", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 1L, "Bidule 3", "http://via.placeholder.com/540x260", "https://www.amazon.fr/Mingzheng-p%C3%A9dales-Walker-Jouets-Premier/dp/B07CPPTJQH/ref=sr_1_2_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571729227&sprefix=jou%2Caps%2C162&sr=8-2-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjhDSk5WTlNMOVQwJmVuY3J5cHRlZElkPUEwNDkzODAyMzlNUFgyVzhGRzY3VyZlbmNyeXB0ZWRBZElkPUEwODIxNzg5ODJYRUFDQjBBNlVSJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 1L, "Truc 4", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 1L, "Truc 5", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 1L, "Truc 6", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 2L, "Truc 7", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 2L, "Machin 8", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 2L, "Bidule 9", "http://via.placeholder.com/540x260", "https://www.amazon.fr/Mingzheng-p%C3%A9dales-Walker-Jouets-Premier/dp/B07CPPTJQH/ref=sr_1_2_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571729227&sprefix=jou%2Caps%2C162&sr=8-2-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjhDSk5WTlNMOVQwJmVuY3J5cHRlZElkPUEwNDkzODAyMzlNUFgyVzhGRzY3VyZlbmNyeXB0ZWRBZElkPUEwODIxNzg5ODJYRUFDQjBBNlVSJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 2L, "Truc 10", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 2L, "Truc 11", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
        add(new Gifts(1L, 2L, "Truc 12", "http://via.placeholder.com/540x260", "https://www.amazon.fr/LEGO-DUPLO-Mes-1ers-pas/dp/B07FP2GRX7/ref=sr_1_1_sspa?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1DHYV1F965K5&keywords=jouet+bebe+1+an&qid=1571728064&sprefix=jou%2Caps%2C162&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzVjNQMFk5RFNXR01HJmVuY3J5cHRlZElkPUEwMzA0MzgyVEtOQzlWU0dVVkdLJmVuY3J5cHRlZEFkSWQ9QTA0ODAyMTczRjlTUFcyUVBHUDU0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==", "LEGO-Mon Premier Puzzle Amusant Duplo Mes 1ers Pas Jeux de Construction, 10885, Multicolore", 15.99));
    }};

}
