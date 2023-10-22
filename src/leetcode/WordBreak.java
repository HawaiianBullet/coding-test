package leetcode;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        boolean output1 = wordBreak(s1, wordDict1); // true
        System.out.println("output1 = " + output1);

        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");
        boolean output2 = wordBreak(s2, wordDict2); // true
        System.out.println("output2 = " + output2);

        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats","dog","sand","and","cat");
        boolean output3 = wordBreak(s3, wordDict3); // false
        System.out.println("output3 = " + output3);
    }
}
