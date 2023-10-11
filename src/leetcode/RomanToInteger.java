package leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                ans -= romanMap.get(s.charAt(i));
            } else {
                ans += romanMap.get(s.charAt(i));
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "III";
        int output1 = romanToInt(s1); // 3
        System.out.println("output1 = " + output1);

        String s2 = "LVIII";
        int output2 = romanToInt(s2); // 58
        System.out.println("output2 = " + output2);

        String s3 = "MCMXCIV";
        int output3 = romanToInt(s3); // 1994
        System.out.println("output3 = " + output3);
    }
}
