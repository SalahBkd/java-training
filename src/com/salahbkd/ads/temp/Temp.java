package com.salahbkd.ads.temp;

import java.util.*;

public class Temp {
    public static void main(String[] args) {
        //System.out.println(firstNonRepeatedChar("a green apple"));
//        System.out.println(firstRepeatedChar("green apple"));
//        System.out.println(longestSubstrWithoutRepeatingChar("geeksforgeeks"));
        longestSubstrWithoutRepeatingChar("pwwkeew").forEach(characters -> System.out.println(characters));
    }

    private static List<List<Character>> longestSubstrWithoutRepeatingChar(String str) {
        Set<Character> set = null;
        List<Character> list = null;
        Map<Integer, List<Character>> map = new HashMap<>();
        var charArray = str.toCharArray();
        int counter = 0;

        for (int i = 0; i < charArray.length; i++) {
            set = new HashSet<>();
            list = new ArrayList<>();
            set.add(charArray[i]);
            list.add(charArray[i]);
            for (int j = i + 1; j < charArray.length; j++) {
                boolean isAdded = set.add(charArray[j]);
                if(isAdded) list.add(charArray[j]);
                else break;
            }
            map.put(++counter, list);
        }
        List<Character> temp = map.get(1);
        List<List<Character>> temps = new ArrayList<>();

        for(var item : map.values()) {
            if(item.size() >= temp.size() && !temp.equals(item)) {
                temp = item;
                temps.add(temp);
            }
        }

        return temps;
    }


    private static Character firstRepeatedChar(String myStr) {
        String str = myStr.replaceAll("\\s", "");
        Set<Character> set = new HashSet<>();
        var charArray = str.toCharArray();
        for(var charact : charArray) {
            boolean isAdded = set.add(charact);
            if(!isAdded) return charact;
        }
        return null;
    }

    private static Character firstNonRepeatedChar(String myStr) {
        String str = myStr.replaceAll("\\s", "");
        int temp = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Set pairs of characters and how many times they are repeated in the string
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            if(currentChar != null) temp++;
            for (int j = i + 1; j < str.length(); j++) {
                Character charInRestOfStr = str.charAt(j);
                if(charInRestOfStr.equals(currentChar)) {
                    temp++;
                }
            }
            if(!hashMap.containsKey(currentChar))
                hashMap.put(currentChar, temp);
            temp = 0;
        }

        // get the first character that repeated one time
        for (int i = 0; i < str.length(); i++) {
            if(hashMap.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return Character.MIN_VALUE;
    }
}
