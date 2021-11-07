package com.salahbkd.ads.arrays;

public class TestArray {

    public static void main(String[] args) {
        Array arr = new Array(4);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.reverse();
        arr.print();
    }

}
