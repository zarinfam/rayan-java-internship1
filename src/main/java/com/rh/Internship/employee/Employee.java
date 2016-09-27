package com.rh.Internship.employee;

/**
 * @author Saeed Zarinfam
 */
public abstract class Employee {
    private String name;
    private String code;

    public Employee(String name, String code) {
        this.code = code;
        this.name = name;
    }

    public abstract float calculateSalary();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
