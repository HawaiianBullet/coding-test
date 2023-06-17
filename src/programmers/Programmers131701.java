package programmers;

import java.util.HashSet;

// https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class Programmers131701 {

    public static int solution(int[] elements) {
        int len = elements.length;
        HashSet<Integer> set = new HashSet<>();
        for (int size = 1; size <= len; size++) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = 0; j < size; j++) {
                    int idx = (i + j) % len;
                    sum += elements[idx];
                }
                set.add(sum);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        int solution = solution(elements); // 18
        System.out.println("solution = " + solution);
    }
}
