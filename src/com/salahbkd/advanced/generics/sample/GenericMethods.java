package com.salahbkd.advanced.generics.sample;

import com.salahbkd.ads.arrays.Array;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static <T> void print(T[] items) {
        for (T item : items)
            System.out.println(item);
    }

    public static void printCollection(GenericCollection<? extends Person> persons) {
        Person person = persons.get(1);
        System.out.println(person.getName());
    }

    public static void addToCollection(GenericCollection<? super Person> persons, Person person) {
        persons.add(person);
    }
}
