package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class Programmers138476 {

    public static int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());

        int answer = 0;
        for (Integer cnt : list) {
            k -= cnt;
            answer++;
            if (k <= 0) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        int k1 = 6;
        int[] tangerine1 = {1, 3, 2, 5, 4, 5, 2, 3};
        int solution1 = solution(k1, tangerine1); // 3
        System.out.println("solution1 = " + solution1);

        int k2 = 4;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        int solution2 = solution(k2, tangerine2);
        System.out.println("solution2 = " + solution2);

        int k3 = 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
        int solution3 = solution(k3, tangerine3);
        System.out.println("solution3 = " + solution3);
    }
}
