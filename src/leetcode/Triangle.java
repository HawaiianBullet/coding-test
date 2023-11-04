package leetcode;

import java.util.List;

// https://leetcode.com/problems/triangle/
public class Triangle {

    // dp[][]
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        return dp[0][0];
    }

    // dp[]
    public static int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int[] arr = new int[n + 1];
            for (int j = 0; j <= i; j++) {
                arr[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
            dp = arr;
        }

        return dp[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle1 = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        int output1 = minimumTotal(triangle1); // 11
        System.out.println("output1 = " + output1);

        List<List<Integer>> triangle2 = List.of(List.of(-10));
        int output2 = minimumTotal(triangle2); // -10
        System.out.println("output2 = " + output2);
    }
}
