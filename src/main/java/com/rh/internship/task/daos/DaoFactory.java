package com.rh.internship.task.daos;

/**
 * @author Saeed Zarinfam
 */
public class DaoFactory {
    private static UserDao userDao = new UserDaoJdbc();

    public static UserDao getUserDao(){
        return userDao;
    }
}
