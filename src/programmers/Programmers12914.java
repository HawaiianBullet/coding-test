package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class Programmers12914 {

    public static long solution(int n) {
        if (n == 1) return 1;

        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n1 = 4;
        long solution1 = solution(n1); // 5
        System.out.println("solution1 = " + solution1);

        int n2 = 3;
        long solution2 = solution(n2); // 3
        System.out.println("solution2 = " + solution2);

    }
}
