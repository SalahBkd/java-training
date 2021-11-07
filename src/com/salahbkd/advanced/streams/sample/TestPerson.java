package com.salahbkd.advanced.streams.sample;

import java.util.Arrays;
import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        List<Person> persons =
                Arrays.asList(new Person(18, "ahmed"), new Person(20, "taha"));

        // Filtering
        long count = persons.stream()
                .filter(person -> person.getAge() > 18)
                .count();
        System.out.println("filters result: " + count);


        // Mapping
        persons.stream()
                .map(person -> person.getName())
                .forEach(name -> System.out.println("mappers result: " + name.toUpperCase()));

        // Sorting persons object based on their age
        persons.stream()
                .sorted((person1, person2) -> person1.compareTo(person2))
                .forEach(person -> System.out.println("sorting result: " + person.getAge()));

        // Reducing
        long numOfPersons = persons.stream()
                .count();
        System.out.println("reducers result: " + numOfPersons);

    }
}
