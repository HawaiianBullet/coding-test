package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {

   /*
   public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }

        return maxLength;
    }
    */

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        Map<Character, Integer> visitedCharacters = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            if (visitedCharacters.containsKey(currentCharacter)
                    && visitedCharacters.get(currentCharacter) >= left) {
                left = visitedCharacters.get(currentCharacter) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            visitedCharacters.put(currentCharacter, right);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        int output1 = lengthOfLongestSubstring(s1); // 3
        System.out.println("output1 = " + output1);

        String s2 = "bbbbb";
        int output2 = lengthOfLongestSubstring(s2); // 1
        System.out.println("output2 = " + output2);

        String s3 = "pwwkew";
        int output3 = lengthOfLongestSubstring(s3); // 3
        System.out.println("output3 = " + output3);
    }
}
