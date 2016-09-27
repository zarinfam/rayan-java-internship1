package com.rh.Internship.employee;

/**
 * @author Saeed Zarinfam
 */
public class HourlyEmployee extends Employee{
    private short hours;
    private long wage;

    public HourlyEmployee(String name, String code, short hours, long wage) {
        super(name, code);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public float calculateSalary() {
        return wage * hours;
    }

    public short getHours() {
        return hours;
    }

    public void setHours(short hours) {
        this.hours = hours;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }
}
