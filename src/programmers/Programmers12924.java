package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class Programmers12924 {

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) break;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        int solution = solution(n); // 4
        System.out.println("solution = " + solution);
    }
}
