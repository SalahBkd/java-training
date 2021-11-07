package com.salahbkd.advanced.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = (a) -> a + 1;
        UnaryOperator<Integer> square = (a) -> a * a;

        int result = increment.andThen(square).apply(10);
        System.out.println(result);
    }
}
