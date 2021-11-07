package com.salahbkd.advanced.collections;

import java.util.Iterator;

public class TestGenericList {

    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(10);
        list.add(20);

        // Iterating using an object iterator:
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Iterating using forEach
        for (Integer item : list)
            System.out.println(item);


    }

}
