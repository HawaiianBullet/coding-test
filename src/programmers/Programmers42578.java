package programmers;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Programmers42578 {

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 1) + 1);
        }

        int answer = 1;
        for (String key : map.keySet()) {
            answer *= map.get(key);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int solution = solution(clothes); // 5
        System.out.println("solution = " + solution);
    }
}
