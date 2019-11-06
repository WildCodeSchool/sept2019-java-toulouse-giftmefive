package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.entity.Lists;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListsRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public List<Lists> findAll() {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM list;"
            );
            ResultSet resultSet = statement.executeQuery();
            List<Lists> lists = new ArrayList<Lists>();
            while (resultSet.next()) {
                int id_list = resultSet.getInt("id_list");
                String list_name = resultSet.getString("list_name");
                String description = resultSet.getString("description");
                String url_image = resultSet.getString("url_image");
                String url_share = resultSet.getString("url_share");
                int id_user = resultSet.getInt("id_user");
                lists.add(new Lists(id_list, list_name, description, url_image, url_share, id_user));
            }
            return lists;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}