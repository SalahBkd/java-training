package com.salahbkd.oop.encapsulation;

public class Employee {
    public static int numberOfEmployees;
    private int baseSalary;
    private int hourlyRate;


    public Employee(int baseSalary) {
        this(baseSalary, 0);
        numberOfEmployees++;
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours) {
        return this.baseSalary + (extraHours * this.hourlyRate);
    }

    public int calculateWage() {
        return this.baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("salary must be greater than 0");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    public static void printNumberOfEmployees() {
        System.out.println(Employee.numberOfEmployees);
    }
}
