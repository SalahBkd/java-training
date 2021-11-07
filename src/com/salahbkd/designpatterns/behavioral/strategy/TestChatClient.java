package com.salahbkd.designpatterns.behavioral.strategy;

public class TestChatClient {
    public static void main(String[] args) {
        //var chatClient = new ChatClient(new DESAlgorithm());
        var chatClient2 = new ChatClient(new AESAlgorithm());
        chatClient2.send();
    }
}
