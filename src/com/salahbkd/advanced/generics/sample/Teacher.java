package com.salahbkd.advanced.generics.sample;

public class Teacher extends Person {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
