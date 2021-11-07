package com.salahbkd.ads.hashtables;

public class TestHashTable {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable(5);
        hashtable.put(10, "test1");
        hashtable.put(11, "test2");
        hashtable.put(13, "test3");
        hashtable.put(14, "test4");
        System.out.println(hashtable.get(11));
        hashtable.remove(10);
    }
}
