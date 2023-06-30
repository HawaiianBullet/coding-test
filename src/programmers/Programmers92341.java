package programmers;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/92341
public class Programmers92341 {

    public static int[] solution(int[] fees, String[] records) {
        Map<String, String> recordMap = new HashMap<>();
        Map<String, Integer> feeMap = new HashMap<>();
        for (String record : records) {
            String[] recordInfo = record.split(" ");
            if (recordMap.containsKey(recordInfo[1])) {
                String[] inTime = recordMap.remove(recordInfo[1]).split(":");
                String[] outTime = recordInfo[0].split(":");
                int hour = Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0]);
                int minute = Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);
                feeMap.put(recordInfo[1], feeMap.getOrDefault(recordInfo[1], 0) + 60 * hour + minute);
            } else {
                recordMap.put(recordInfo[1], recordInfo[0]);
            }
        }

        for (String recordKey : recordMap.keySet()) {
            String[] inTime = recordMap.get(recordKey).split(":");
            int hour = 23 - Integer.parseInt(inTime[0]);
            int minute = 59 - Integer.parseInt(inTime[1]);
            feeMap.put(recordKey, feeMap.getOrDefault(recordKey, 0) + 60 * hour + minute);
        }

        ArrayList<String> list = new ArrayList<>(feeMap.keySet());
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int totalTime = feeMap.get(list.get(i));
            int extraFee = 0;
            if (totalTime > fees[0]) {
                int extraTime = (int) Math.ceil((double) (totalTime - fees[0]) / fees[2]);
                extraFee = extraTime * fees[3];
            }
            answer[i] = fees[1] + extraFee;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT",
                "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] solution = solution(fees, records);
        System.out.println("solution = " + Arrays.toString(solution)); // [14600, 34400, 5000]
    }
}
