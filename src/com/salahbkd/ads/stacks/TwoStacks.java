package com.salahbkd.ads.stacks;

import java.util.Arrays;

public class TwoStacks {
    private int[] items;
    private int capacity;
    private int aCounter;
    private int bCounter;

    public TwoStacks(int capacity) {
        items = new int[capacity];
        this.capacity = capacity;
        aCounter = -1;
        bCounter = capacity;
    }

    public void push1(int item) {
        if (isFull1())
            throw new StackOverflowError();
        aCounter = aCounter + 1;
        items[aCounter] = item;
    }

    public int pop1() {
        if (isEmpty1())
            throw new IllegalAccessError();

        int tempItem = items[aCounter];
        aCounter = aCounter - 1;
        return tempItem;
    }

    public boolean isEmpty1() {
        return aCounter == -1;
    }

    public boolean isFull1() {
        return aCounter + 1 == bCounter;
    }

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError();
        bCounter = bCounter - 1;
        items[bCounter] = item;
    }

    public int pop2() {
        if (isEmpty2())
            throw new IllegalAccessError();

        int tempItem = items[bCounter];
        bCounter = bCounter + 1;
        return tempItem;
    }

    public boolean isEmpty2() {
        return bCounter == capacity;
    }

    public boolean isFull2() {
        return bCounter - 1 == aCounter;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
