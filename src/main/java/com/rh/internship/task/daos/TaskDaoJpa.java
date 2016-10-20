package com.rh.internship.task.daos;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public class TaskDaoJpa extends GeneralDaoJpa implements TaskDao {
    @Override
    public List<Task> getTaskByUserId(long userId) {
        return null;
    }

    @Override
    public void addTasks(List<Task> tasks, User user) {
        runJpaCode(em -> {
            tasks.forEach(task -> {
                task.setUser(user);
                em.persist(task);
            });
            return null;
        }, true);
    }

    @Override
    public boolean deleteTask(long taskId) {
        return runJpaCode(em -> {
                    em.remove(em.find(Task.class, taskId));
                    return true;
                }
                , true).orElseGet(() -> false);
    }
}
