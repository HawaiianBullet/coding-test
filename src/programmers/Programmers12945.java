package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class Programmers12945 {

    public static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i -2]) % 1234567;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n1 = 3;
        int solution1 = solution(n1); // 2
        System.out.println("solution1 = " + solution1);

        int n2 = 5;
        int solution2 = solution(n2); // 5
        System.out.println("solution2 = " + solution2);

        int n3 = 100;
        int solution3 = solution(n3);
        System.out.println("solution3 = " + solution3);
    }
}
