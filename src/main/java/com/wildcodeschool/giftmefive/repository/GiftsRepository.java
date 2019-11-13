package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.entity.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiftsRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public List<Gift> findAllById(Long idList) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM gift WHERE id_list = ?;"
            );
            statement.setLong(1, idList);
            ResultSet resultSet = statement.executeQuery();
            List<Gift> gifts = new ArrayList<>();
            while (resultSet.next()) {
                Long idGift = resultSet.getLong("id_gift");
                String giftName = resultSet.getString("gift_name");
                String description = resultSet.getString("description");
                float price = resultSet.getFloat("price");
                int preference = resultSet.getInt("preference");
                String urlImage = resultSet.getString("url_image");
                String urlWeb = resultSet.getString("url_website");
                Long idFriend = resultSet.getLong("id_friend");
                gifts.add(new Gift(idGift, giftName, description, price, preference, urlImage, urlWeb, idList, idFriend));
            }
            return gifts;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Gift findById(Long idGift) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM gift WHERE id_gift = ?;"
            );
            statement.setLong(1, idGift);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String giftName = resultSet.getString("gift_name");
                String description = resultSet.getString("description");
                float price = resultSet.getFloat("price");
                int preference = resultSet.getInt("preference");
                String urlImage = resultSet.getString("url_image");
                String urlWeb = resultSet.getString("url_website");
                Long idList = resultSet.getLong("id_list");
                Long idFriend = resultSet.getLong("id_friend");

                return new Gift(idGift, giftName, description, price, preference, urlImage, urlWeb, idList, idFriend);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteGift(Long id) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM gift WHERE id_gift=?;"
            );
            statement.setLong(1, id);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to delete data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGift(Long idGift, String giftName, String description, float price,
                           int preference, String urlImage, String urlWebsite) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE gift SET gift_name=?, description=?, price=? , preference=?, url_image=? , url_website=? " +
                            " WHERE id_gift=?"
            );
            statement.setString(1, giftName);
            statement.setString(2, description);
            statement.setFloat(3, price);
            statement.setInt(4, preference);
            statement.setString(5, urlImage);
            statement.setString(6, urlWebsite);
            statement.setLong(7, idGift);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to update data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}