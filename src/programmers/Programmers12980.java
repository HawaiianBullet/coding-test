package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class Programmers12980 {

    public static int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                n--;
                ans++;
            }
            n /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int solution1 = solution(n1); // 2
        System.out.println("solution1 = " + solution1);

        int n2 = 6;
        int solution2 = solution(n2); // 2
        System.out.println("solution2 = " + solution2);

        int n3 = 5000;
        int solution3 = solution(n3); // 5
        System.out.println("solution3 = " + solution3);
    }
}
