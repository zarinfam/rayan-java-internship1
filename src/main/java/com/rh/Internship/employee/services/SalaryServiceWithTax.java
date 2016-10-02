package com.rh.Internship.employee.services;

import com.rh.Internship.employee.Employee;
import com.rh.Internship.employee.SalariedEmployee;

/**
 * @author Saeed Zarinfam
 */
public class SalaryServiceWithTax implements SalaryService {

    @Override
    public float calculateSalary(Employee employee) {
        float taxRate = employee instanceof SalariedEmployee ? 0.9F: 0.95F;
        return employee.calculateSalary() * taxRate;
    }

}
