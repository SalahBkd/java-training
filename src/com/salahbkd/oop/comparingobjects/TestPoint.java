/*
 * 	Object class methods
 * 		equals(): by default it compares objects based on there references
 * 		toString(): prints the object name based on it's hashCode value
 * 		hashCode(): produces a unique hashcode of the object based on it's memory address
 *
 * 	Best practice: if we are overriding equals() we must override hashCode()
 * 	because if two objects are equals then there hashCode values should be equal too.
 *
 * */
package com.salahbkd.oop.comparingobjects;

public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
    }

}
