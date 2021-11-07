package com.salahbkd.advanced.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperators {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = (a) -> a * a;

        int result = add.andThen(square).apply(10, 2);
        System.out.println(result);
    }
}
