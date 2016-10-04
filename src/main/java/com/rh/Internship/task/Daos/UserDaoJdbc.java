package com.rh.Internship.task.Daos;

import com.rh.Internship.task.models.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public class UserDaoJdbc implements UserDao{
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
        return null;
    }
}
