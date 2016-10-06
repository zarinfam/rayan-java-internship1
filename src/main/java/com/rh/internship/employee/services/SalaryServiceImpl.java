package com.rh.internship.employee.services;

import com.rh.internship.employee.Employee;

/**
 * @author Saeed Zarinfam
 */
public class SalaryServiceImpl implements SalaryService{

    @Override
    public float calculateSalary(Employee employee) {
        return employee.calculateSalary();
    }

}
