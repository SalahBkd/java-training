package com.salahbkd.designpatterns.structural.facade;

public class NotificationService {

    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();

        var connection = server.connect("10.10.10.120");
        var authToken = server.authenticate(new AuthToken());
        server.send(authToken, new Message(message), target);

        connection.close();
    }
}
