package com.salahbkd.ads.stacks;

import java.util.Arrays;

public class MyStack {

    private int[] items;
    private int count = 0;

    public MyStack(int size) {
        items = new int[size];
    }

    public void push(int item) {
        if (isStackFilled()) {
            throw new StackOverflowError();
        }
        items[count] = item;
        count++;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();
        count--;
        return items[count];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private boolean isStackFilled() {
        return items.length == count;
    }

    @Override
    public String toString() {
        int[] elements = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(elements);
    }
}
