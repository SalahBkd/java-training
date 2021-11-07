package com.salahbkd.advanced.generics.sample;

import java.util.List;

public class GenericCollection<T> {
    private T[] items = (T[]) new Object[5];
    private int counter;

    public void add(T item) {
        items[counter++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public T[] getItems() {
        return items;
    }
}
