package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/coin-change/
public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        int output1 = coinChange(coins1, amount1); // 3
        System.out.println("output1 = " + output1);

        int[] coins2 = {2};
        int amount2 = 3;
        int output2 = coinChange(coins2, amount2); // -1
        System.out.println("output2 = " + output2);

        int[] coins3 = {1};
        int amount3 = 0;
        int output3 = coinChange(coins3, amount3); // 0
        System.out.println("output3 = " + output3);
    }
}
