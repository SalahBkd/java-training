package com.salahbkd.ads.hashtables;

import java.util.*;

public class HashTable {
    private LinkedList<Entry>[] entries = null;
    private int size;

    public HashTable(int size) {
        this.size = size;
        entries = new LinkedList[size];
    }

    public void put(int key, String value) {
        int index = hash(key);

        if (entries[index] == null)
            entries[index] = new LinkedList<Entry>();

        LinkedList<Entry> slot = entries[index];
        for (Entry entry : slot) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        slot.addLast(new Entry(key, value));
    }

    private int hash(int key) {
        return key % size;
    }

    public String get(int key) {
        int index = hash(key);
        LinkedList<Entry> slot = entries[index];

        if (slot != null) {
            for (Entry entry : slot) {
                if (entry.key == key)
                    return entry.value;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> slot = entries[index];

        if (slot == null)
            throw new IllegalStateException();

        for (Entry entry : slot) {
            if (entry.key == key) {
                slot.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }


}
