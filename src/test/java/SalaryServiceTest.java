import com.rh.Internship.employee.Employee;
import com.rh.Internship.employee.HourlyEmployee;
import com.rh.Internship.employee.SalariedEmployee;
import com.rh.Internship.employee.services.SalaryService;
import com.rh.Internship.employee.services.SalaryServiceFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Saeed Zarinfam
 */

public class SalaryServiceTest {

    @Test
    public void calculateSalary_calculateHourlyEmployeeSalary_returnSalary() {
        SalaryService salaryService = SalaryServiceFactory.get();

        assertThat(salaryService.calculateSalary(
                new HourlyEmployee("ali", "123", (short) 80, 10000l))
                , equalTo((float) 800000)
        );
    }

    @Test
    public void calculateSalary_calculateSalariedEmployeeSalary_returnSalary() {
        SalaryService salaryService = SalaryServiceFactory.get();

        assertThat(salaryService.calculateSalary(
                new SalariedEmployee("ali", "123", 1000000l))
                , equalTo((float) 1000000)
        );
    }

    @Test
    public void calculateBatchSalary_calculateEmployeeListSalary_returnResultMap() {
        SalaryService salaryService = SalaryServiceFactory.get();


        List<Employee> employeeList = Arrays.asList(
                new SalariedEmployee("sara", "124", 1000000l)
                , new HourlyEmployee("ali", "123", (short) 80, 10000l)
        );

        Map<String, Float> resultMap = salaryService.calculateBatchSalary(employeeList);

        assertThat(resultMap.size(), equalTo(2));
        assertThat(resultMap.get("124"), equalTo(1000000F));
        assertThat(resultMap.get("123"), equalTo(800000F));

    }

}
