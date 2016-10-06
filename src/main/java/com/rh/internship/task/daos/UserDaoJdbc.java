package com.rh.internship.task.daos;

import com.rh.internship.task.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public class UserDaoJdbc implements UserDao{

    // JDBC database URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/task_db?characterEncoding=UTF-8&useSSL=false";

    // Database credentials
    static final String USER = "test";
    static final String PASS = "p";

    @Override
    public Optional<User> insertUser(User user) {
        return null;
    }

    @Override
    public Optional<User> updateUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(long userId) {
        return false;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> userList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            try (Statement stmt = conn.createStatement()) {
                String sql = "SELECT * FROM user";
                ResultSet rs = stmt.executeQuery(sql);
                //STEP 3: Extract data from result set
                while (rs.next()) {
                    userList.add(new User(rs.getLong(1), rs.getString(2)));
                }
                rs.close();
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        return userList;
    }
}
