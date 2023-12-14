package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/
public class DifferenceBetweenOnesAndZerosInRowAndColumn {

    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];
        int[] zerosRow = new int[m];
        int[] zerosCol = new int[n];

        for (int i = 0; i < m; i++) {
            int ones = 0;
            int zeros = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ones++;
                } else {
                    zeros++;
                }
            }
            onesRow[i] = ones;
            zerosRow[i] = zeros;
        }

        for (int i = 0; i < n; i++) {
            int ones = 0;
            int zeros = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1) {
                    ones++;
                } else {
                    zeros++;
                }
            }
            onesCol[i] = ones;
            zerosCol[i] = zeros;
        }

        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }

        return diff;
    }

    public static int[][] onesMinusZeros2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        for (int i = 0; i < m; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) ones++;
            }
            onesRow[i] = ones;
        }

        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1) ones++;
            }
            onesCol[i] = ones;
        }

        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = 2 * (onesRow[i] + onesCol[j]) - m - n;
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        int[][] output1 = onesMinusZeros(grid1); // [[0,0,4],[0,0,4],[-2,-2,2]]
        System.out.println("output1 = " + Arrays.deepToString(output1));

        int[][] grid2 = {{1, 1, 1}, {1, 1, 1}};
        int[][] output2 = onesMinusZeros(grid2); // [[5,5,5],[5,5,5]]
        System.out.println("output2 = " + Arrays.deepToString(output2));
    }
}
