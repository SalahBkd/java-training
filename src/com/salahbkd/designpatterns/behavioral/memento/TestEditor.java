package com.salahbkd.designpatterns.behavioral.memento;

public class TestEditor {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("modification1");
        history.push(editor.createState());

        editor.setContent("modification2");
        history.push(editor.createState());

        editor.setContent("modification3");
        editor.restore(history.pop());

        System.out.println(editor.getContent());


    }
}
