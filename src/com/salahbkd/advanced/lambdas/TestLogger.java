package com.salahbkd.advanced.lambdas;

public class TestLogger {

    public static String test;

    public static void main(String[] args) {
        // using a class implementation
        log(new ConsoleLogger());

        // using anonymous inner class
        log(new Logger() {
            @Override
            public void log(String msg) {
                System.out.println("logging " + msg + " with anonymous inner class");
            }
        });

        // using lambda expression
        log((msg) -> System.out.println("logging " + msg + " with lambda expression"));
    }

    public static void log(Logger logger) {
        logger.log("LOG-MESSAGE");
    }

}
