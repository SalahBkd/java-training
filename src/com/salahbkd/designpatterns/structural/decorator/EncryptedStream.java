package com.salahbkd.designpatterns.structural.decorator;

public class EncryptedStream implements Stream {
    private Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encryptedData = encrypt(data);
        stream.write(encryptedData);
    }

    private String encrypt(String data) {
        return "/S.AKJE724862480DZN";
    }
}
