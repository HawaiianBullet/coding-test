package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12923
public class Programmers12923 {

    public static int[] solution(long begin, long end) {
        int first = (int) begin;
        int last = (int) end;
        int[] answer = new int[last - first + 1];
        for (int i = first, idx = 0; i <= last; i++) {
            answer[idx++] = findBlockNum(i);
        }

        return answer;
    }

    private static int findBlockNum(int num) {
        if (num == 1) return 0;
        if (num == 2 || num == 3) return 1;

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i);
                if (num / i <= 10000000) {
                    return num / i;
                }
            }
        }

        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }

        return 1;
    }

    public static void main(String[] args) {
        long begin = 1;
        long end = 10;
        int[] solution = solution(begin, end); // {0, 1, 1, 2, 1, 3, 1, 4, 3, 5}
        System.out.println("solution = " + Arrays.toString(solution));

        long begin2 = 100000014;
        long end2 = 100000016;
        int[] solution2 = solution(begin2, end2);
        System.out.println("solution2 = " + Arrays.toString(solution2)); // {6, 5, 6250001}
    }
}
