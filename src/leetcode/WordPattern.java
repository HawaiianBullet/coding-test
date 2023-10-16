package leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/word-break/
public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        char[] charArr = pattern.toCharArray();

        if (sArr.length != charArr.length) return false;

        HashMap<Character, String> patternMap = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            char key = charArr[i];
            String val = sArr[i];
            if (patternMap.containsKey(key)) {
                String patternVal = patternMap.get(key);
                if (!patternVal.equals(val)) return false;
            } else {
                if (patternMap.containsValue(val)) return false;
                patternMap.put(key, val);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        boolean output1 = wordPattern(pattern1, s1); // true
        System.out.println("output1 = " + output1);

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        boolean output2 = wordPattern(pattern2, s2); // false
        System.out.println("output2 = " + output2);

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        boolean output3 = wordPattern(pattern3, s3); // false
        System.out.println("output3 = " + output3);

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        boolean output4 = wordPattern(pattern4, s4); // false
        System.out.println("output4 = " + output4);
    }
}
