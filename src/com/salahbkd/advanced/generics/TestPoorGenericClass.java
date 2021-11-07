package com.salahbkd.advanced.generics;

public class TestPoorGenericClass {

    public static void main(String[] args) {
        var genericCollection = new PoorGenericCollection();
        genericCollection.add(Integer.valueOf(10));
        genericCollection.add("10");

        int value = (int) genericCollection.get(0); // manually casting the returned value to an integer.
        int value2 = (int) genericCollection.get(1); // we get ClassCastException run-time exception.

        // this the problem that generics came to solve.
        // we won't be aware of bugs like the one in line 11 until we run the application.
        // it would be better if we catch the error at compile-time.
    }
}
