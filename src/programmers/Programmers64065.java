package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Programmers64065 {

    public static int[] solution(String s) {
        String[] arr = s.replaceAll("[{}]", "").split(",");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] solution1 = solution(s1);
        System.out.println("solution1 = " + Arrays.toString(solution1));
    }
}
