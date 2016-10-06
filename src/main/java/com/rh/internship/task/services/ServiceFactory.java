package com.rh.internship.task.services;

import com.rh.internship.task.daos.UserDao;
import com.rh.internship.task.daos.UserDaoJdbc;

/**
 * @author Saeed Zarinfam
 */
public class ServiceFactory {
    private static UserService userService = new UserServiceImpl();

    public static UserService getUserService() {
        return userService;
    }
}
