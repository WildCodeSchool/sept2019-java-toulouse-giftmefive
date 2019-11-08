package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.entity.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiftsRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public List<Gift> findAllById(int idList) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM gift WHERE id_list = ?;"
            );
            statement.setInt(1, idList);
            ResultSet resultSet = statement.executeQuery();
            List<Gift> gifts = new ArrayList<>();
            while (resultSet.next()) {
                int idGift = resultSet.getInt("id_gift");
                String giftName = resultSet.getString("gift_name");
                String description = resultSet.getString("description");
                float price = resultSet.getFloat("price");
                int preference = resultSet.getInt("preference");
                String urlImage = resultSet.getString("url_image");
                String urlWeb = resultSet.getString("url_website");
                int idFriend = resultSet.getInt("id_friend");
                gifts.add(new Gift(idGift, giftName, description, price, preference, urlImage, urlWeb, idList, idFriend));
            }
            return gifts;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Gift findById(int idGift) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM gift JOIN list ON gift.id_gift = list.id_list WHERE gift.id_list = ?;"
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
                int idList = resultSet.getInt("id_list");
                int idFriend = resultSet.getInt("id_friend");
                return new Gift(idGift, giftName, description, price, preference, urlImage, urlWeb, idList, idFriend);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void deleteGift(int id) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM gift WHERE id_gift=?;"
            );
            statement.setInt(1, id);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to delete data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}