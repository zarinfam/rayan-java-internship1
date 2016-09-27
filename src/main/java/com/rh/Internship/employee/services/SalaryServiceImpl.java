package com.rh.Internship.employee.services;

import com.rh.Internship.employee.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Saeed Zarinfam
 */
public class SalaryServiceImpl implements SalaryService{

    @Override
    public float calculateSalary(Employee employee) {
        return employee.calculateSalary();
    }

    @Override
    public Map<String, Float> calculateBatchSalary(List<Employee> employeeList) {
        Map<String, Float> salaryResult = new HashMap<>();

        for (Employee employee : employeeList){
            salaryResult.put(employee.getCode(), calculateSalary(employee));
        }

        return salaryResult;
    }
}
