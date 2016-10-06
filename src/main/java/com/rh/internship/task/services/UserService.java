package com.rh.internship.task.services;

import com.rh.internship.task.models.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public interface UserService {
    Optional<User> createUser(User user);
    List<User> getAllUser();
}
