package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/178870
public class Programmers178870 {

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0, right = 0, sum = 0, range = Integer.MAX_VALUE;
        while (left < sequence.length) {
            if (sum > k || right == sequence.length) {
                sum -= sequence[left++];
            } else {
                sum += sequence[right++];
            }

            if (sum == k) {
                if (range > right - left - 1) {
                    range = right - left - 1;
                    answer[0] = left;
                    answer[1] = right - 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] sequence = {1, 2, 3, 4, 5};
//        int k = 7;
//        int[] solution = solution(sequence, k);
//        System.out.println("solution = " + Arrays.toString(solution)); // [2, 3]

//        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
//        int k = 5;
//        int[] solution = solution(sequence, k);
//        System.out.println("solution = " + Arrays.toString(solution)); // [6, 6]

        int[] sequence = {2, 2, 2, 2, 2};
        int k = 6;
        int[] solution = solution(sequence, k);
        System.out.println("solution = " + Arrays.toString(solution)); // [0, 2]
    }
}
