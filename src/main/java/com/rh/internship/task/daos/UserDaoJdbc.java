package com.rh.internship.task.daos;

import com.rh.internship.task.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public class UserDaoJdbc extends GeneralDaoJdbc implements UserDao {

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
        return runQuery(statement -> {
            List<User> userList = new ArrayList<>();

            String sql = "SELECT * FROM user";
            try {
                ResultSet rs = statement.executeQuery(sql);
                //STEP 3: Extract data from result set
                while (rs.next()) {
                    userList.add(new User(rs.getLong(1), rs.getString(2)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return userList;
        }).orElseGet(ArrayList::new);
    }

    @Override
    public Optional<User> getUser(long userId) {
        return null;
    }
}
