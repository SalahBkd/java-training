package com.salahbkd.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {
        private ProductCollection productCollection;
        private int index;

        public ArrayIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return this.productCollection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return (index < this.productCollection.products.size());
        }
    }

}
