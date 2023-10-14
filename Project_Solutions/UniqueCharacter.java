package com.Project17;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacter {
    public static int firstNonRepeating(String s) {
        // Create a LinkedHashMap to maintain the order of characters in the string
        Map<Character, Integer> counts = new LinkedHashMap<>();

        // Count the occurrences of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Iterate through the map to find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }

        // If no non-repeating characters were found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(firstNonRepeating(s));
    }
}
