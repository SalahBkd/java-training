package com.salahbkd.advanced.streams;

public class Product implements Comparable<Product> {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Product other) {
        return 0;
    }
}
