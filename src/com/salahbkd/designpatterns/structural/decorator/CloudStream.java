package com.salahbkd.designpatterns.structural.decorator;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("storing: " +data);
    }
}
