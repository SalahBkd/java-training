package com.salahbkd.advanced.generics;

import java.util.List;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    // when we use ? wildcard the compiler creates:
    // class CAP#1 {..} 

    // using extends keyword
    // class CAP#1 extends Building {..}
    public static void print(List<? extends Building> buildings) {

        // RETRIEVING FROM A LIST
        // we can store the returned value in a variable of type Object bcz CAP#1 is sub-type
        // of Object. 
        //Object x = buildings.get(0);

        // when using extends keyword we can store the returned value in a variable of type 
        // Building bcz Building is the super class of CAP#1.
        // with the extends keyword we can only read from a list, we can't add to it.
        //Building x2 = buildings.get(0);
        // buildings.add(new ...) // invalid

        // ADDING TO A LIST
        // to add to a list we must use the super keyword
        // we can't read from the list using super keyword.
        //buildings.add(new Building("building2"));
        //buildings.add(new House("house2"));

    }
}
