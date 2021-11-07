package com.salahbkd.advanced.lambdas;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("logging " + msg + " with ConsoleLogger");
    }

}
