package com.salahbkd.advanced.generics;

public class TestUser {
    public static void main(String[] args) {

        User user1 = new User(10);
        User user2 = new User(20);
        int result = user1.compareTo(user2);
        if (result < 0) {
            System.out.println("user1 < user2");
        } else if (result == 0) {
            System.out.println("user1 == user2 ");
        } else {
            System.out.println("user1 > user2");
        }
    }
}
