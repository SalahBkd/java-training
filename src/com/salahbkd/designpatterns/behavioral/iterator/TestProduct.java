package com.salahbkd.designpatterns.behavioral.iterator;

public class TestProduct {
    public static void main(String[] args) {
        var products = new ProductCollection();
        products.add(new Product(1, "product1"));
        products.add(new Product(2, "product2"));

        Iterator iterator = products.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

    }
}
