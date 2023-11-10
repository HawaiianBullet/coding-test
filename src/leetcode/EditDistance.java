package leetcode;

// https://leetcode.com/problems/edit-distance/
public class EditDistance {

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1)
                        ? dp[i - 1][j - 1]
                        : Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String word11 = "horse";
        String word12 = "ros";
        int output1 = minDistance(word11, word12); // 3
        System.out.println("output1 = " + output1);
        
        String word21 = "intention";
        String word22 = "execution";
        int output2 = minDistance(word21, word22); // 5
        System.out.println("output2 = " + output2);
    }
}
