package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean anagram1 = isAnagram(s1, t1); // true
        System.out.println("anagram1 = " + anagram1);

        String s2 = "rat";
        String t2 = "car";
        boolean anagram2 = isAnagram(s2, t2); // false
        System.out.println("anagram2 = " + anagram2);
    }
}
