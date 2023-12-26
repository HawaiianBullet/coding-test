package leetcode;

// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
public class NumberOfDiceRollsWithTargetSum {

    public static int numRollsToTarget(int n, int k, int target) {
        final int MOD = 1000000007;
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i * k, target); j++) {
                for (int l = 1; l <= Math.min(k, j); l++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - l]) % MOD;
                }
            }
        }

        return dp[n][target];
    }
    public static void main(String[] args) {
        int n1 = 1;
        int k1 = 6;
        int target1 = 3;
        int output1 = numRollsToTarget(n1, k1, target1); // 1
        System.out.println("output1 = " + output1);

        int n2 = 2;
        int k2 = 6;
        int target2 = 7;
        int output2 = numRollsToTarget(n2, k2, target2); // 6
        System.out.println("output2 = " + output2);

        int n3 = 30;
        int k3 = 30;
        int target3 = 500;
        int output3 = numRollsToTarget(n3, k3, target3); // 222616187
        System.out.println("output3 = " + output3);
    }
}
