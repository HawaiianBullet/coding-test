package programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/131704
public class Programmers131704 {

    public static int solution(int[] order) {
        if (order.length == 1) return 1;

        int currentBox = 1;
        Deque<Integer> belt = new ArrayDeque<>();
        List<Integer> truck = new ArrayList<>();
        for (int orderBox : order) {
            if (currentBox == orderBox) {
                truck.add(orderBox);
                currentBox = orderBox + 1;
                continue;
            }
            if (currentBox < orderBox) {
                for (int i = currentBox; i < orderBox; i++) {
                    belt.addLast(i);
                }
                truck.add(orderBox);
                currentBox = orderBox + 1;
                continue;
            }
            if (currentBox > orderBox) {
                if (belt.getLast() == orderBox) {
                    belt.removeLast();
                    truck.add(orderBox);
                    continue;
                }
                break;
            }
        }

        return truck.size();
    }

    public static void main(String[] args) {
//        int[] order = {4, 3, 1, 2, 5};
//        int solution = solution(order); // 2
//        System.out.println("solution = " + solution);
//        int[] order = {5, 4, 3, 2, 1};
//        int solution = solution(order); // 5
//        System.out.println("solution = " + solution);
        int[] order = {3, 5, 4, 2, 1};
        int solution = solution(order); // 5
        System.out.println("solution = " + solution);
    }
}
