package com.salahbkd.designpatterns.structural.facade;

public class TestNotificationService {
    public static void main(String[] args) {
        var notificationService = new NotificationService();
        notificationService.send("message1", "target1");
    }
}
