package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/87390
public class Programmers87390 {

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        for (long i = left; i <= right; i++) {
            int row = (int) (i / n);
            int col = (int) (i % n);
            answer[(int) (i - left)] = Math.max(row, col) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 3;
        long left1 = 2;
        long right1 = 5;
        int[] solution1 = solution(n1, left1, right1); // [3,2,2,3]
        System.out.println("solution1 = " + Arrays.toString(solution1));

        int n2 = 4;
        long left2 = 7;
        long right2 = 14;
        int[] solution2 = solution(n2, left2, right2); // [4,3,3,3,4,4,4,4]
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }
}
