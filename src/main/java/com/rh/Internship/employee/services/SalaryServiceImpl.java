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

}
