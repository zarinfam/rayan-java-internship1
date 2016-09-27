package com.rh.Internship.employee.services;

import com.rh.Internship.employee.Employee;

import java.util.List;
import java.util.Map;

/**
 * @author Saeed Zarinfam
 */
public interface SalaryService {

    float calculateSalary(Employee employee);
    Map<String, Float> calculateBatchSalary(List<Employee> employeeList);
}
