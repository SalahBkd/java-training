package com.salahbkd.oop.abstraction;

/*
 * Abstraction: reduce complexity by hiding unnecessary details
 *
 * in this example we are only interested in navigating the browser not how the browser
 * will perform that task.
 *
 * */
public class TestBrowser {

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.navigate("www.google.com");
    }

}
