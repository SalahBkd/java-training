package com.salahbkd.oop.inheritance;

public class TextBox extends UIControl {
    private String text = "";

    TextBox(boolean isEnabled) {
        super(isEnabled);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String toString() {
        return this.text;
    }
}
