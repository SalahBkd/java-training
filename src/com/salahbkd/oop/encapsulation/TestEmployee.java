package com.salahbkd.oop.encapsulation;

/*
 * 	Encapsulation: meaning bundling the data and the methods that operates on the data
 * 	in a single unit.
 *
 * Method overloading: be aware of it, but don't overuse it
 *
 *
 * */

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee(50_000, 10);
        System.out.println(emp1.calculateWage(20));
        Employee.printNumberOfEmployees();
    }

}
