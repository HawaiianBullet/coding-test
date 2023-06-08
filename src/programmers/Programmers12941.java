package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12941
public class Programmers12941 {

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int total = A.length;
        int answer = 0;
        for (int i = 0; i < total; i++) {
            answer += A[i] * B[total - i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 4, 2};
        int[] B1 = {5, 4, 4};
        int solution1 = solution(A1, B1); // 29
        System.out.println("solution1 = " + solution1);

        int[] A2 = {1, 2};
        int[] B2 = {3, 4};
        int solution2 = solution(A2, B2); // 10
        System.out.println("solution2 = " + solution2);
    }
}
