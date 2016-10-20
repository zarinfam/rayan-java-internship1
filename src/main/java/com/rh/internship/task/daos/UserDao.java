package com.rh.internship.task.daos;

import com.rh.internship.task.models.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public interface UserDao {
    Optional<User> insertUser(User user);
    Optional<User> updateUser(User user);
    boolean deleteUser(long userId);
    List<User> selectAllUser();
    Optional<User> getUser(long userId);
}
