package com.rh.internship.task.daos;

import com.rh.internship.task.models.Task;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public interface TaskDao {
    List<Task> getTaskByUserId(long userId);
}
