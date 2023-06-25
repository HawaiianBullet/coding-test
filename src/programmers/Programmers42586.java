package programmers;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class Programmers42586 {

    public static int[] solution(int[] progresses, int[] speeds) {
        if (progresses.length == 1) return new int[]{1};

        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int quotient = (100 - progresses[i]) / speeds[i];
            int remainder = (100 - progresses[i]) % speeds[i];
            int day = remainder > 0 ? quotient + 1 : quotient;
            days[i] = day;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int deploy = days[0], cnt = 1;
        for (int i = 1; i < days.length; i++) {
            if (deploy >= days[i]) {
                cnt++;
            } else {
                list.add(cnt);
                deploy = days[i];
                cnt = 1;
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] solution = solution(progresses, speeds); // {2, 1}
        System.out.println("solution = " + solution);
    }
}
