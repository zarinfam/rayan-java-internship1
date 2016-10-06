import com.rh.internship.employee.Employee;
import com.rh.internship.employee.HourlyEmployee;
import com.rh.internship.employee.SalariedEmployee;
import com.rh.internship.employee.services.SalaryService;
import com.rh.internship.employee.services.SalaryServiceFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Saeed Zarinfam
 */

public class SalaryServiceWithTaxTest {

    private static SalaryService salaryService;

    @BeforeClass
    public static void beforeAllTest(){
        SalaryServiceFactory.changeImplementation(SalaryServiceFactory.Type.WITH_TAX);
        salaryService = SalaryServiceFactory.get();
    }

    @AfterClass
    public static void afterAllTest(){
        SalaryServiceFactory.changeImplementation(SalaryServiceFactory.Type.WITHOUT_TX);
    }


    @Test
    public void calculateSalaryWithTax_calculateHourlyEmployeeSalary_returnSalary() {
        assertThat(salaryService.calculateSalary(
                new HourlyEmployee("ali", "123", (short) 80, 10000l))
                , equalTo((float) 760000)
        );
    }

    @Test
    public void calculateSalaryWithTax_calculateSalariedEmployeeSalary_returnSalary() {
        SalaryServiceFactory.changeImplementation(SalaryServiceFactory.Type.WITH_TAX);
        SalaryService salaryService = SalaryServiceFactory.get();

        assertThat(salaryService.calculateSalary(
                new SalariedEmployee("ali", "123", 1000000l))
                , equalTo((float) 900000)
        );
    }

    @Test
    public void calculateBatchSalaryWithTax_calculateEmployeeListSalary_returnResultMap() {
        SalaryServiceFactory.changeImplementation(SalaryServiceFactory.Type.WITH_TAX);
        SalaryService salaryService = SalaryServiceFactory.get();

        List<Employee> employeeList = Arrays.asList(
                new SalariedEmployee("sara", "124", 1000000l)
                , new HourlyEmployee("ali", "123", (short) 80, 10000l)
        );

        Map<String, Float> resultMap = salaryService.calculateBatchSalary(employeeList);

        assertThat(resultMap.size(), equalTo(2));
        assertThat(resultMap.get("124"), equalTo(900000F));
        assertThat(resultMap.get("123"), equalTo(760000F));

    }

}
