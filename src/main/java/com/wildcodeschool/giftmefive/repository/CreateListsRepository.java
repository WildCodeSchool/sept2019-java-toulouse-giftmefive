package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.model.RegisterLists;
import java.sql.*;

public class CreateListsRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public static RegisterLists save(String list_name, String description, String url_image) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO list (list_name, description, url_image, url_share, id_user) VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, list_name);
            statement.setString(2, description);
            statement.setString(3, url_image);
            statement.setString(4, "localhost:8080/listes");
            statement.setInt(5, 2);

/*id_user à créer et insert*/

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to insert data");
            }

            ResultSet generatedKeys = statement.getGeneratedKeys();

            if (generatedKeys.next()) {
                Long id = generatedKeys.getLong(1);
                return new RegisterLists(list_name, description, url_image);
            } else {
                throw new SQLException("failed to get inserted id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}