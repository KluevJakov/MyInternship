package com.github.KluevJakov.myinternship;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramsTask {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!freqMap.containsKey(c)) {
                freqMap.put(c, 1);
            } else {
                freqMap.put(c, freqMap.get(c) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!freqMap.containsKey(c)) {
                return false;
            } else {
                int freq = freqMap.get(c) - 1;
                if (freq < 0) {
                    return false;
                }
                freqMap.put(c, freq);
            }
        }
        return true;
    }
}
