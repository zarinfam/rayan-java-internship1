package com.rh.internship.task.daos;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public interface TaskDao {
    List<Task> getTaskByUserId(long userId);
    void addTasks(List<Task> tasks, User user);
    boolean deleteTask(long taskId);
}
