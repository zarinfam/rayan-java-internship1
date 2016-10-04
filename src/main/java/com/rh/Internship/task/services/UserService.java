package com.rh.Internship.task.services;

import com.rh.Internship.task.models.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public interface UserService {
    Optional<User> createUser(User user);
    List<User> getAllUser();
}
