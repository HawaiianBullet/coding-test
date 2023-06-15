package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class Programmers42747 {

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int hIdx = citations.length - i;
            if (citations[i] >= hIdx) {
                answer = hIdx;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int solution = solution(citations); // 3
        System.out.println("solution = " + solution);
    }
}
