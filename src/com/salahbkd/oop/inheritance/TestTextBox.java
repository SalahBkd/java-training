/*
 * 	Upcasting: casting an object to one of it's super types
 *
 * 	Downcasting: downcasting an object to one of it's sub types
 *
 *
 *
 * */
package com.salahbkd.oop.inheritance;

public class TestTextBox {

    public static void main(String[] args) {
        UIControl control = new UIControl(true);
        TextBox textBox = new TextBox(false);
        print(textBox);
    }

    public static void print(UIControl control) { // if we pass a derived class of UIControl will be UPCASTED (upcasting)
        if (control instanceof TextBox) {
            TextBox temp = (TextBox) control; // downcasting  (if we want to use methods of TextBox)
            temp.setText("hello");
        }
        System.out.println(control);
    }

}
