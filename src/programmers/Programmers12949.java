package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12949
public class Programmers12949 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr11 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr21 = {{3, 3}, {3, 3}};
        int[][] solution1 = solution(arr11, arr21); // {{15, 15}, {15, 15}, {15, 15}}
        System.out.println("solution1 = " + Arrays.deepToString(solution1));

        int[][] arr12 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr22 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] solution2 = solution(arr12, arr22); // {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}
        System.out.println("solution2 = " + Arrays.deepToString(solution2));
    }
}
