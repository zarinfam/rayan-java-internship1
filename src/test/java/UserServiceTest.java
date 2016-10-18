import com.rh.internship.employee.Employee;
import com.rh.internship.employee.HourlyEmployee;
import com.rh.internship.employee.SalariedEmployee;
import com.rh.internship.employee.services.SalaryService;
import com.rh.internship.employee.services.SalaryServiceFactory;
import com.rh.internship.task.daos.DaoFactory;
import com.rh.internship.task.daos.UserDao;
import com.rh.internship.task.models.User;
import com.rh.internship.task.services.ServiceFactory;
import com.rh.internship.task.services.UserService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * @author Saeed Zarinfam
 */

public class UserServiceTest {

    private static UserService userService = ServiceFactory.getUserService();
    private static UserDao userDao = DaoFactory.getUserDao();

    @Test
    public void getAllUsers_getAllUsersFromDao_returnAllUsers() {
        List<User> allUser = userService.getAllUser();

        assertThat(allUser.size(), equalTo(4));

        assertThat(allUser.stream().map(user -> user.getId()).collect(Collectors.toList())
                , containsInAnyOrder(1l, 2l, 3l, 4l));

        assertThat(allUser.stream().map(user -> user.getName()).collect(Collectors.toList())
                , containsInAnyOrder("Sara", "Sam", "Ali", "Naghi"));

    }

    @Test
    public void createUser_createUserUsingService_createdUserInDB() {
        User createdUser = new User("test-create");
        userService.createUser(createdUser);

        List<User> allUser = userDao.selectAllUser();
        assertThat(allUser.size(), equalTo(5));

        assertThat(allUser.stream().map(user -> user.getName()).collect(Collectors.toList())
                , containsInAnyOrder("Sara", "Sam", "Ali", "Naghi", "test-create"));

        //cleanup db
        userDao.deleteUser(createdUser.getId());

    }
}
