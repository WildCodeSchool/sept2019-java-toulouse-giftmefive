package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.model.RegisterGifts;
import com.wildcodeschool.giftmefive.model.RegisterLists;

import java.sql.*;

public class CreateGiftRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public static RegisterGifts save(String url_image, String url_article, String gift_name, String description_gift, int price) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO Gift (url_image, url_article, gift_name, description_gift, price) VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, url_image);
            statement.setString(2, url_article);
            statement.setString(3, gift_name);
            statement.setString(4, description_gift);
            statement.setInt(5, price);

            /*id_user à créer et insert*/

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to insert data");
            }

            ResultSet generatedKeys = statement.getGeneratedKeys();

            if (generatedKeys.next()) {
                Long id = generatedKeys.getLong(1);
                return new RegisterGifts(url_image, url_article, gift_name, description_gift, price);
            } else {
                throw new SQLException("failed to get inserted id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
