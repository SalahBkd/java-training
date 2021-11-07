package com.salahbkd.advanced.comparingobjects;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "salah"));
        list.add(new Student(2, "ayoub"));
        list.add(new Student(1, "ousama"));

        System.out.println("Unsorted: " + list);
        System.out.println("-----------------");
        list.sort(new NameComparator());
        System.out.println("Sorted: " + list);

        /*System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() == student2.hashCode());*/


    }
}
