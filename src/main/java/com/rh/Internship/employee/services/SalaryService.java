package com.rh.Internship.employee.services;

import com.rh.Internship.employee.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Saeed Zarinfam
 */
public interface SalaryService {

    float calculateSalary(Employee employee);

    default Map<String, Float> calculateBatchSalary(List<Employee> employeeList) {
        Map<String, Float> salaryResult = new HashMap<>();

        employeeList.forEach(employee -> salaryResult.put(employee.getCode(), calculateSalary(employee)));

        return salaryResult;
    }
}
