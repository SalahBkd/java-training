package com.salahbkd.designpatterns.creational.singleton;

public class Logger {
    private static Logger instance;
    private static boolean initialized = false;

    private Logger() {
    }

    public static Logger getInstance() {
        if(initialized) return instance;
        instance = new Logger();
        initialized = true;
        return instance;
    }
}
