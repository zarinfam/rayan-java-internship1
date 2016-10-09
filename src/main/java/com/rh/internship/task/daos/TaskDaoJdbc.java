package com.rh.internship.task.daos;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Saeed Zarinfam
 */
public class TaskDaoJdbc extends GeneralDaoJdbc implements TaskDao {
    @Override
    public List<Task> getTaskByUserId(long userId) {
        String sql = "SELECT * FROM task where userId = ?";
        return runQuery(preparedStatement -> {
            List<Task> taskList = new ArrayList<>();

            try {
                preparedStatement.setLong(1, userId);
                ResultSet rs = preparedStatement.executeQuery();
                //STEP 3: Extract data from result set
                while (rs.next()) {
                    taskList.add(new Task(rs.getLong(1), rs.getString(2), rs.getString(3)
                            , new User(rs.getLong(1), "")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return taskList;
        }, sql).orElseGet(ArrayList::new);
    }
}
