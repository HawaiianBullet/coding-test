package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Programmers42587 {

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : priorities) {
            pq.add(num);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if (i == location)
                        return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int solution = solution(priorities, location); // 1
        System.out.println("solution = " + solution);
    }
}
