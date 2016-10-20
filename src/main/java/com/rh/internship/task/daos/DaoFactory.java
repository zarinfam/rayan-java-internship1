package com.rh.internship.task.daos;

/**
 * @author Saeed Zarinfam
 */
public class DaoFactory {
    private static UserDao userDao = new UserDaoJpa();
    private static TaskDao taskDao = new TaskDaoJpa();

    public static UserDao getUserDao(){
        return userDao;
    }

    public static TaskDao getTaskDao() {
        return taskDao;
    }
}
