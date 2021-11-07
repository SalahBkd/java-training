package com.salahbkd.advanced.generics;

public class PoorGenericCollection {
    private Object[] items = new Object[10];
    private int counter = 0;

    public void add(Object item) {
        items[counter] = item;
        counter++;
    }

    public Object get(int index) {
        return items[index];
    }

}
