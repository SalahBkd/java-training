package com.salahbkd.designpatterns.creational.singleton;

public class TestLogger {
    public static void main(String[] args) {
        var logger1 = Logger.getInstance();
        var logger2 = Logger.getInstance();
        System.out.println(logger1 == logger2);

    }
}
