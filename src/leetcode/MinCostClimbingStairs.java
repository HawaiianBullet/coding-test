package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = n - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }

        return Math.min(cost[0], cost[1]);
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        int output1 = minCostClimbingStairs(cost1); // 15
        System.out.println("output1 = " + output1);

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int output2 = minCostClimbingStairs(cost2); // 6
        System.out.println("output2 = " + output2);
    }
}
