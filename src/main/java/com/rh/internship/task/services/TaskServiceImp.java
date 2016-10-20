package com.rh.internship.task.services;

import com.rh.internship.task.daos.DaoFactory;
import com.rh.internship.task.daos.TaskDao;
import com.rh.internship.task.daos.UserDao;
import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public class TaskServiceImp implements TaskService {

    private TaskDao taskDao = DaoFactory.getTaskDao();
    private UserDao userDao = DaoFactory.getUserDao();

    @Override
    public List<Task> getAllTask(long userId) {
        return null;
    }

    @Override
    public List<Task> findTaskByUser(User user, String titlePart) {
        return null;
    }

    @Override
    public void addTasksForUser(List<Task> tasks, long userId) {
        userDao.getUser(userId).ifPresent(user -> taskDao.addTasks(tasks, user));
    }
}
