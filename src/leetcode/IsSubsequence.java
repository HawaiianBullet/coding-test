package leetcode;

// https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int sIdx = 0, tIdx = 0;
        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";
        boolean output1 = isSubsequence(s1, t1); // true
        System.out.println("output1 = " + output1);

        String s2 = "axc";
        String t2 = "ahbgdc";
        boolean output2 = isSubsequence(s2, t2); // false
        System.out.println("output2 = " + output2);
    }
}
