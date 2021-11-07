package com.salahbkd;

public class Test {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);


        String str5 = "salah /eddine /boukadi /honsi";
        String[] arr = str5.split("/");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
