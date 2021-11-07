package com.salahbkd.designpatterns.behavioral.observer;

public class Stock extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setStock(int value) {
        this.value = value;
        notifyObservers();
    }
}
