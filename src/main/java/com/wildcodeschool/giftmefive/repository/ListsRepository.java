package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.entity.Gift;
import com.wildcodeschool.giftmefive.entity.ListGift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListsRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public List<ListGift> findAll() {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM list;"
            );
            ResultSet resultSet = statement.executeQuery();
            List<ListGift> lists = new ArrayList<ListGift>();
            while (resultSet.next()) {
                int idList = resultSet.getInt("id_list");
                String listName = resultSet.getString("list_name");
                String description = resultSet.getString("description");
                String urlImage = resultSet.getString("url_image");
                String urlShare = resultSet.getString("url_share");
                int idUser = resultSet.getInt("id_user");
                lists.add(new ListGift(idList, listName, description, urlImage, urlShare, idUser));
            }
            return lists;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ListGift findById(int idList) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(

                    "SELECT * FROM list WHERE id_list = ?;"
            );
            statement.setLong(1, idList);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            String listName = resultSet.getString("list_name");
            String description = resultSet.getString("description");
            String urlImage = resultSet.getString("url_image");
            String urlShare = resultSet.getString("url_share");
            int idUser = resultSet.getInt("id_user");
            return new ListGift(idList, listName, description, urlImage, urlShare, idUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

        public void deleteList(int id) {
            try {
                Connection connection = DriverManager.getConnection(
                        DB_URL, DB_USER, DB_PASSWORD
                );
                PreparedStatement statement = connection.prepareStatement(
                        "DELETE FROM list WHERE id_list=?;"
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