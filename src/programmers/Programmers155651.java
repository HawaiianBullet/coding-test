package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

// https://school.programmers.co.kr/learn/courses/30/lessons/155651
public class Programmers155651 {

    public static int solution(String[][] book_time) {
        int[][] checkTimes = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            int checkInTime = Integer.parseInt(book_time[i][0].replace(":", ""));
            int checkOutTime = Integer.parseInt(book_time[i][1].replace(":", ""));

            checkOutTime += 10;
            if (checkOutTime % 100 >= 60) checkOutTime += 40;

            checkTimes[i][0] = checkInTime;
            checkTimes[i][1] = checkOutTime;
        }

        Arrays.sort(checkTimes, (a, b) -> {
            if (a[0] > b[0]) return 1;
            else if (a[0] < b[0]) return -1;
            else {
                if (a[1] > b[1]) return 1;
                else return -1;
            }
        });

        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for (int[] checkTime : checkTimes) {
            if (rooms.size() == 0) {
                rooms.add(checkTime[1]);
                continue;
            }

            int leaveTime = rooms.peek();
            if (checkTime[0] >= leaveTime) {
                rooms.poll();
                rooms.add(checkTime[1]);
            } else {
                rooms.add(checkTime[1]);
            }
        }

        return rooms.size();
    }

    public static void main(String[] args) {
        String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        int solution = solution(book_time); // 3
        System.out.println("solution = " + solution);
    }
}
