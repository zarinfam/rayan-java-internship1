package com.rh.internship.task.services;

import com.rh.internship.task.models.Task;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public interface TaskService {
    List<Task> getAllTask(long userId);
}
