package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Programmers12985 {

    public static int solution(int n, int a, int b) {
        int answer = 1;
        while (Math.abs(a - b) != 1 || Math.max(a, b) % 2 != 0) {
            a = a % 2 == 0 ? a / 2 : (a + 1) / 2;
            b = b % 2 == 0 ? b / 2 : (b + 1) / 2;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        int solution = solution(n, a, b); // 3
        System.out.println("solution = " + solution);

        int n2 = 8;
        int a2 = 4;
        int b2 = 5;
        int solution2 = solution(n2, a2, b2);
        System.out.println("solution2 = " + solution2);
    }
}
