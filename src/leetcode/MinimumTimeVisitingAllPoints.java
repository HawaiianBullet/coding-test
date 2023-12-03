package leetcode;

// https://leetcode.com/problems/minimum-time-visiting-all-points/
public class MinimumTimeVisitingAllPoints {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0, n = points.length;
        for (int i = 0; i < n - 1; i++) {
            int x = Math.abs(points[i][0] - points[i + 1][0]);
            int y = Math.abs(points[i][1] - points[i + 1][1]);
            ans += Math.max(x, y);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] points1 = {{1, 1}, {3, 4,}, {-1, 0}};
        int output1 = minTimeToVisitAllPoints(points1); // 7
        System.out.println("output1 = " + output1);

        int[][] points2 = {{3, 2}, {-2, 2}};
        int output2 = minTimeToVisitAllPoints(points2); // 5
        System.out.println("output2 = " + output2);
    }
}
