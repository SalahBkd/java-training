package com.salahbkd.designpatterns.behavioral.observer;


public class StatusBar implements Observer {
    Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("statusbar got updated: " + stock.getValue());
    }
}
