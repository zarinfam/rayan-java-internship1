package com.rh.Internship.task.Daos;

import com.rh.Internship.task.models.User;

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
}
