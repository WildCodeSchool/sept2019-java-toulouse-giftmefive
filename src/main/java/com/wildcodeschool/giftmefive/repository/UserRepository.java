package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public User save(int idUser, String username, String password, String email) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE user SET username=?, password=?, email=? WHERE id_user=?"
            );
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, email);
            statement.setInt(4, idUser);
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to update data");
            }
            return new User(idUser, email, password, username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
