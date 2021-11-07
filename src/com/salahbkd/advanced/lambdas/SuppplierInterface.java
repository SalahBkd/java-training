package com.salahbkd.advanced.lambdas;

import java.util.function.Supplier;

public class SuppplierInterface {
    public static void main(String[] args) {
        Supplier<String> greet = () -> "Hello!";
        String result = greet.get(); // lazy evaluation, the lambda its executed only if we explicitly call it here.
        System.out.println(result);
    }
}
