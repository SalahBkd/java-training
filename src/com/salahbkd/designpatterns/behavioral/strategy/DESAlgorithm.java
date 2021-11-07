package com.salahbkd.designpatterns.behavioral.strategy;

public class DESAlgorithm implements Algorithm {
    @Override
    public void encrypt() {
        System.out.println("encrypting with DES");
    }
}
