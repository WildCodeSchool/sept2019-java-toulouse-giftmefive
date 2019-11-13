package com.wildcodeschool.giftmefive.repository;

import com.wildcodeschool.giftmefive.model.User;

import java.sql.*;

public class CreateUserRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/gift_me_five?serverTimezone=GMT";
    private final static String DB_USER = "greg";
    private final static String DB_PASSWORD = "Greg.321";

    public User save(String username, String password, String email, Long idUser) {
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO user (username, password, email) VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, email);

            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to insert data");
            }

            ResultSet generatedKeys = statement.getGeneratedKeys();

            if (generatedKeys.next()) {
                Long id = generatedKeys.getLong(1);
                return new User(username, password, email, idUser);
            } else {
                throw new SQLException("failed to get inserted id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
