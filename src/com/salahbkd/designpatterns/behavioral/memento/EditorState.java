package com.salahbkd.designpatterns.behavioral.memento;

public class EditorState {
    private String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}