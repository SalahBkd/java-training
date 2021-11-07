package com.salahbkd.designpatterns.behavioral.observer;

public class SpreadSheet implements Observer {
    DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("spreadsheet got updated"+ dataSource.getValue());
    }
}
