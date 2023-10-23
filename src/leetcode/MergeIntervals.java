package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0], end = intervals[i][1];
            while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }

            list.add(List.of(start, end));
        }


        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] output1 = merge(intervals1); // [[1,6],[8,10],[15,18]]
        System.out.println("output1 = " + Arrays.deepToString(output1));

        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] output2 = merge(intervals2); // [[1,5]]
        System.out.println("output2 = " + Arrays.deepToString(output2));

        int[][] intervals3 = {{1, 4}, {2, 3}};
        int[][] output3 = merge(intervals3); // [[1,4]]
        System.out.println("output3 = " + Arrays.deepToString(output3));
    }
}
