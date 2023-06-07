package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181188
public class Programmers181188 {

    public static int solution(int[][] targets) {
        Arrays.sort(targets, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int answer = 1;
        int last = targets[0][1];
        for (int[] target : targets) {
            if (target[0] >= last) {
                last = target[1];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] targets = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};
        int solution = solution(targets); // 3
        System.out.println("solution = " + solution);
    }
}
