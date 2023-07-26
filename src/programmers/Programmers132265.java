package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/132265
public class Programmers132265 {

    public static int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int t : topping) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        for (int t : topping) {
            map.put(t, map.get(t) - 1);
            set.add(t);
            if (map.get(t) == 0) map.remove(t);
            if (map.size() == set.size()) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        int solution = solution(topping); // 2
        System.out.println("solution = " + solution);
    }
}
