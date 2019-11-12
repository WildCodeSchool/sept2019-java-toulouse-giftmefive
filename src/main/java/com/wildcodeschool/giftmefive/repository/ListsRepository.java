package com.wildcodeschool.giftmefive.repository;

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

                Long idList = resultSet.getLong("id_list");
                String listName = resultSet.getString("list_name");
                String description = resultSet.getString("description");
                String urlImage = resultSet.getString("url_image");
                String urlShare = resultSet.getString("url_share");
                Long idUser = resultSet.getLong("id_user");
                lists.add(new ListGift(idList, listName, description, urlImage, urlShare, idUser));
            }
            return lists;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ListGift findById(Long idList) {

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
            Long idUser = resultSet.getLong("id_user");

            return new ListGift(idList, listName, description, urlImage, urlShare, idUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteList(Long id) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM list WHERE id_list=?;"
            );
            statement.setLong(1, id);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to delete data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteGiftFromList(Long id) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM gift WHERE id_list=?;"
            );
            statement.setLong(1, id);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to delete data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateList(Long idList, String listName, String description, String urlImage) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE list SET list_name=?, description=?, url_image=? WHERE id_list=?"
            );
            statement.setString(1, listName);
            statement.setString(2, description);
            statement.setString(3, urlImage);
            statement.setLong(4, idList);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to update data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}