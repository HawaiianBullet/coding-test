package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) == t.charAt(i)) continue;
                return false;
            } else {
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        boolean output1 = isIsomorphic(s1, t1); // true
        System.out.println("output1 = " + output1);

        String s2 = "foo";
        String t2 = "bar";
        boolean output2 = isIsomorphic(s2, t2); // false
        System.out.println("output2 = " + output2);

        String s3 = "paper";
        String t3 = "title";
        boolean output3 = isIsomorphic(s3, t3); // true
        System.out.println("output3 = " + output3);

        String s4 = "badc";
        String t4 = "baba";
        boolean output4 = isIsomorphic(s4, t4); // false
        System.out.println("output4 = " + output4);
    }
}
