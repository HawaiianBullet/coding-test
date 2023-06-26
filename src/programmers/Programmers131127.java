package programmers;

import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class Programmers131127 {

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> tmpMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                tmpMap.put(discount[j], tmpMap.getOrDefault(discount[j], 0) + 1);
            }

            boolean isSame = true;
            for (String key : map.keySet()) {
                if (map.get(key) != tmpMap.get(key)) {
                    isSame = false;
                    break;
                }
            }

            answer += isSame ? 1 : 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int solution = solution(want, number, discount); // 3
        System.out.println("solution = " + solution);
    }
}
