package com.rh.internship.task.services;

import com.rh.internship.task.daos.DaoFactory;
import com.rh.internship.task.daos.UserDao;
import com.rh.internship.task.models.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = DaoFactory.getUserDao();

    @Override
    public Optional<User> createUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
