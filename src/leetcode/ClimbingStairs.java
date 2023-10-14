package leetcode;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    // 내 풀이
    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // 다른 사람 풀이 참고 - 배열을 사용하지 않는 풀이
    public static int climbStairs2(int n) {
        if (n == 1) return 1;

        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = curr;
            curr += prev;
            prev = tmp;
        }

        return curr;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int output1 = climbStairs(n1); // 2
        System.out.println("output1 = " + output1);

        int n2 = 3;
        int output2 = climbStairs(n2); // 3
        System.out.println("output2 = " + output2);
    }
}
