package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/knight-dialer/
public class KnightDialer {

    public static int knightDialer(int n) {
        int mod = 1000000007;
        int[][] moves = {{4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9}, {}, {0, 1, 7}, {2, 6}, {1, 3,}, {2, 4}};
        int[][] dp = new int[n][10];
        Arrays.fill(dp[0], 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int move : moves[j]) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][move]) % mod;
                }
            }
        }

        int sum = 0;
        for (int num : dp[n - 1]) {
            sum = (sum + num) % mod;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 1;
        int output1 = knightDialer(n1); // 10
        System.out.println("output1 = " + output1);

        int n2 = 2;
        int output2 = knightDialer(n2); // 20
        System.out.println("output2 = " + output2);

        int n3 = 3131;
        int output3 = knightDialer(n3); // 136006598
        System.out.println("output3 = " + output3);
    }
}
