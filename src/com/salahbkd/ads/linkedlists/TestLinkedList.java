package com.salahbkd.ads.linkedlists;

import java.util.Arrays;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(40);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(50);
//        System.out.println(Arrays.toString(ll.toArray()));
        ll.deleteFirst();
//        System.out.println(Arrays.toString(ll.toArray()));

//        ll.addLast(20);
//        ll.addLast(30);
//        ll.addLast(40);
//        ll.addLast(50);
//        ll.reverse();
//        System.out.println(Arrays.toString(ll.toArray()));
//		ll.addLast(40);
//		ll.addLast(50);
//		ll.printMiddle();
//        System.out.println(ll.hasALoop());
    }

}
