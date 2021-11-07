package com.salahbkd.advanced.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUser {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("boukadi", "boukadi@email.com"));
        users.add(new User("ahmed", "ahmed@email.com"));

        // Sorting with comparable interface
        Collections.sort(users);

        // Sorting with Comparator object
        Collections.sort(users, new EmailComparator());
        for (User user : users)
            System.out.println(user);
    }

}
