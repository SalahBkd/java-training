package com.salahbkd.designpatterns.structural.decorator;

public class CompressedData implements Stream {
    private Stream stream;

    public CompressedData(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedData = compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        return data.substring(0, 6);
    }
}
