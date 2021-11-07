package com.salahbkd.designpatterns.behavioral.iterator;

public interface Iterator {
    void next();

    Product current();

    boolean hasNext();
}
