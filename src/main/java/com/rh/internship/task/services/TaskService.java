package com.rh.internship.task.services;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public interface TaskService {
    List<Task> getAllTask(long userId);
    List<Task> findTaskByUser(String titlePart);
    void addTasksForUser(List<Task> tasks, User user);
}
