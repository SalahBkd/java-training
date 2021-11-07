package com.salahbkd.advanced.lambdas;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        // simple usage of the Function interface
        Function<String, Integer> map = (str) -> str.length();
        int result = map.apply("Hello!");
        System.out.println(result);


        // composing functions
        Function<String, String> replaceColon = (str) -> str.replace(":", "=");
        Function<String, String> addBraces = (str) -> "{" + str + "}";

        // first composing method
        String res = replaceColon
                .andThen(addBraces)
                .apply("key:value");

        // second composing method
        String res2 = addBraces.compose(replaceColon).apply("key:value");

        System.out.println(res + "\n" + res2);

    }
}
