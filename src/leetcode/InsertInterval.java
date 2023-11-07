package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/insert-interval/
public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int tmpStart = intervals[0][0];
        int tmpEnd = intervals[0][1];
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (end < newInterval[0]) {
                tmpStart = Math.min(tmpStart, start);
                tmpEnd = Math.max(tmpEnd, end);
                list.add(new int[]{tmpStart, tmpEnd});
            } else { // end >= newInterval[1]
                if ()
            }

        }

        return null;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] output1 = insert(intervals1, newInterval1); // [[1,5],[6,9]]
        System.out.println("output1 = " + Arrays.deepToString(output1));

//        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
//        int[] newInterval2 = {4, 8};
//        int[][] output2 = insert(intervals2, newInterval2); // [[1,2],[3,10],[12,16]]
//        System.out.println("output2 = " + Arrays.deepToString(output2));
    }
}
