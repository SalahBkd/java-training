package com.salahbkd.designpatterns.behavioral.memento;

public class TestDocument {
    public static void main(String[] args) {
        var doc = new Document();
        var docsHistory = new DocsHistory();

        doc.setContent("content1");
        doc.setFontName("fontname1");
        doc.setFontSize(16);
        docsHistory.push(doc.createState());

        doc.setContent("content2");
        doc.setFontName("fontname2");
        doc.setFontSize(16);
        docsHistory.push(doc.createState());

        doc.setContent("content3");
        doc.setFontName("fontname3");
        doc.setFontSize(16);
        // undo 1
        doc.restoreState(docsHistory.pop());
        // undo 2
        doc.restoreState(docsHistory.pop());

        System.out.println(doc);


    }
}
