package com.salahbkd.advanced.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceImpl {
    public static void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Imperative style
        for (int item : list)
            System.out.println(item);

        // Declarative style
        // forEach takes a consumer 
        list.forEach((item) -> System.out.println(item));

        // Chaining consumers
        List<String> strings = Arrays.asList("str1", "str2");
        strings.add("test1");
        strings.add("test2");

        Consumer<String> print = (item) -> System.out.println(item);
        Consumer<String> printUpperCase = (item) -> System.out.println(item.toUpperCase());
        strings.forEach(print.andThen(printUpperCase));

    }
}
