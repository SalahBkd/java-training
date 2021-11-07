package com.salahbkd.designpatterns.behavioral.observer;

public class TestStock {
    public static void main(String[] args) {
        var stock = new Stock();

        stock.addObserver(new StatusBar(stock));
        stock.addObserver(new StockListView(stock));

        stock.setStock(100);


    }
}
