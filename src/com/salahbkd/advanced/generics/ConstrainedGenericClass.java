package com.salahbkd.advanced.generics;

public class ConstrainedGenericClass<T extends Number> {
    private T[] items = (T[]) new Object[10];
    private int counter = 0;

    public void add(T item) {
        items[counter] = item;
        counter++;
    }

    public T get(int index) {
        return items[index];
    }
}
