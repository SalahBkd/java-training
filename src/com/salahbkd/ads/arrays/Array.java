/*
 * Dynamic array class implementation
 *
 * */
package com.salahbkd.ads.arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] tempItems = new int[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                tempItems[i] = items[i];
            }
            items = tempItems;
        }

        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        items[index] = 0;
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public int max() {
        int max = items[0];
        for (int i = 0; i < items.length; i++) {
            if(items[i] > max)
                max = items[i];
        }
        return max;
    }

    public Array intersect(Array other) {
        Array arr = new Array(other.count);
        for (int i = 0; i < items.length; i++) {
            int currentItem = items[i];
            for (int j = 0; j < other.items.length; j++) {
                int otherItem = other.items[j];
                if(currentItem == otherItem) {
                    arr.insert(items[i]);
                    break;
                }
            }
        }
        return arr;
    }

    public void reverse() {
        Array newArr = new Array(count);
        for (int i = items.length - 1; i >= 0 ; i--) {
            newArr.insert(items[i]);
        }
        items = newArr.items;
    }
}
