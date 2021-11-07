package com.salahbkd.designpatterns.behavioral.strategy;

public class AESAlgorithm implements  Algorithm {
    @Override
    public void encrypt() {
        System.out.println("encrypting with AES");
    }
}
