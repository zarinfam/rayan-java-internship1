import com.rh.internship.task.daos.DaoFactory;
import com.rh.internship.task.daos.TaskDao;
import com.rh.internship.task.daos.UserDao;
import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;
import com.rh.internship.task.services.ServiceFactory;
import com.rh.internship.task.services.TaskService;
import com.rh.internship.task.services.UserService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Saeed Zarinfam
 */

public class TaskServiceTest {

    private static TaskService taskService = ServiceFactory.getTaskService();
    private static UserDao userDao = DaoFactory.getUserDao();
    private static TaskDao taskDao = DaoFactory.getTaskDao();

    @Test
    public void addTasksToUser_addTasksToUser_tasksAssignedToUser() {
        long userIdTest = 2;

        User userBeforeTest = userDao.getUser(userIdTest).get();

        assertThat(userBeforeTest.getTaskList().size(), equalTo(2));

        List<Task> taskList = Arrays.asList(
                new Task("task test 1", "task test 1")
                , new Task("task test 2", "task test 2")
        );

        taskService.addTasksForUser(taskList, userIdTest);

        User userAfterTest = userDao.getUser(userIdTest).get();

        assertThat(userAfterTest.getTaskList().size(), equalTo(4));

        //clean up database
        userAfterTest.getTaskList().stream()
                .filter(task -> (task.getTitle().startsWith("task test")))
                .forEach(task -> taskDao.deleteTask(task.getId()));
        ;

    }


}
