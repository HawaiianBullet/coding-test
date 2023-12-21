package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int maxWidth = 0;
        for (int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i - 1][0];
            maxWidth = Math.max(width, maxWidth);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        int[][] points1 = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        int output1 = maxWidthOfVerticalArea(points1); // 1
        System.out.println("output1 = " + output1);

        int[][] points2 = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        int output2 = maxWidthOfVerticalArea(points2); // 3
        System.out.println("output2 = " + output2);
    }
}
