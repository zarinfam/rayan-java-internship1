package com.rh.internship.task.services;

/**
 * @author Saeed Zarinfam
 */
public class ServiceFactory {
    private static UserService userService = new UserServiceImpl();
    private static TaskService taskService = new TaskServiceImp();

    public static UserService getUserService() {
        return userService;
    }

    public static TaskService getTaskService() {
        return taskService;
    }
}
