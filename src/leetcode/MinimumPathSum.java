package leetcode;

// https://leetcode.com/problems/minimum-path-sum/
public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                int down = i - 1 < 0 ? 200 : dp[i - 1][j];
                int right = j - 1 < 0 ? 200 : dp[i][j - 1];
                dp[i][j] = grid[i][j] + Math.min(down, right);

            }
        }

        return dp[m - 1][n - 1];
    }

    public static int minPathSum2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int output1 = minPathSum(grid1); // 7
        System.out.println("output1 = " + output1);

        int[][] grid2 = {{1, 2, 3,}, {4, 5, 6,}};
        int output2 = minPathSum(grid2); // 12
        System.out.println("output2 = " + output2);
    }
}
