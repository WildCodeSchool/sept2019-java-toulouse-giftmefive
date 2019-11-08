package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.entity.User;
import com.wildcodeschool.giftmefive.model.RegisterGifts;
import org.springframework.ui.ModelMap;

import javax.persistence.*;
import java.sql.*;

public class CreateGiftRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public static RegisterGifts save(String urlImage, String urlWebsite, String giftName, String description,
                                     int preference, double price, Long idList) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO gift (url_image, url_website, gift_name, description, preference, price, id_list) "
                            + " VALUES (?, ?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, urlImage);
            statement.setString(2, urlWebsite);
            statement.setString(3, giftName);
            statement.setString(4, description);
            statement.setInt(5, preference);
            statement.setDouble(6, price);
            statement.setLong(7, idList);
            //TODO set list_id

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to insert data");
            }

            ResultSet generatedKeys = statement.getGeneratedKeys();

            if (generatedKeys.next()) {
                Long id = generatedKeys.getLong(1);
                return new RegisterGifts(urlImage, urlWebsite, giftName, description, preference, price, idList);
            } else {
                throw new SQLException("failed to get inserted id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}