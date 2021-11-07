package com.salahbkd.ads.queues;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int front = 0;
    private int back = 0;
    private int count = 0;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    public void enqueu(int item) {
        if (isFull())
            throw new IllegalStateException();

        items[back] = item;
        // for circular array [0, 0, 0, 10] if we add an item
        // the array will look like [20, 0, 0, 10] front = 10 and back = 20
        back = (back + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        int temp = items[front];
        items[front] = 0;
        front = (front + 1) % items.length; // for circular array
        count--;
        return temp;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[front];
    }

    public String print() {
        return Arrays.toString(items);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return items.length == count;
    }

}
