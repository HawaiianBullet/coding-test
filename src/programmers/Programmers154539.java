package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/154539
public class Programmers154539 {

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        for (int i = numbers.length - 2; i >= 0 ; i--) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    answer[i] = numbers[j];
                    break;
                } else {
                    if (answer[j] == -1) {
                        answer[i] = -1;
                        break;
                    }
                    if (numbers[i] < answer[j]) {
                        answer[i] = answer[j];
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] numbers = {2, 3, 3, 5};
//        int[] solution = solution(numbers); // [3, 5, 5, -1]
//        System.out.println("solution = " + Arrays.toString(solution));

        int[] numbers = {9, 1, 5, 3, 6, 2};
        int[] solution = solution(numbers); // [-1, 5, 6, 6, -1, -1]
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
