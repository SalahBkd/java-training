package com.salahbkd.advanced.generics;

public class TestUtils {

    public static void main(String[] args) {
        User userWithMax = Utils.max(new User(10), new User(20));
        System.out.println(userWithMax);
    }

}
