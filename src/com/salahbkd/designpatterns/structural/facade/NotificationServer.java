package com.salahbkd.designpatterns.structural.facade;

public class NotificationServer {
    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(AuthToken authToken) {
        return new AuthToken();
    }

    public void send(AuthToken token, Message msg, String target) {
        System.out.println("sending notification...");
    }
}
