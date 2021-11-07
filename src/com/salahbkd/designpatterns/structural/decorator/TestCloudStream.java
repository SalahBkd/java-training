package com.salahbkd.designpatterns.structural.decorator;

public class TestCloudStream {
    public static void main(String[] args) {
        Stream stream = new EncryptedStream(new CloudStream());
        stream.write("some data to be stored....");
    }
}
