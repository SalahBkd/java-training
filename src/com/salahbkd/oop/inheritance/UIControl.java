package com.salahbkd.oop.inheritance;

public class UIControl {
    private boolean isEnabled;

    UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

}
