package com.salahbkd.ads.hashtables;

import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "salah");
        map.put(2, "yusuf");
        map.put(3, "hamza");
        map.put(3, "hamza"); // overwrites the previous one
        map.put(null, null); // we can insert null as key/value
        map.containsKey(3); // O(1)
        map.containsValue("hamza"); // O(n)
        //System.out.println(map);
        //for(Integer item : map.keySet()) 
        //	System.out.println(item);

        //System.out.println(firstNonRepeatedChar("a green apple"));
        System.out.println(firstRepeatedChar("green apple"));
    }

    private static char firstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char charc = str.charAt(i);
            if (set.contains(charc))
                return charc;
            set.add(str.charAt(i));
        }
        return 0;
    }

    public static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char charc = str.charAt(i);
            if (map.containsKey(charc)) {
                count = map.get(charc);
                map.put(charc, count + 1);
            } else {
                map.put(charc, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char charc = str.charAt(i);
            if (map.get(charc) == 1) {
                return charc;
            }
        }
        return 0;
    }

}
