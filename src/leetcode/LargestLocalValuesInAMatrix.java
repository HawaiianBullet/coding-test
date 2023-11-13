package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/largest-local-values-in-a-matrix/
public class LargestLocalValuesInAMatrix {

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] matrix = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                matrix[i][j] = findMaxValue(grid, i, j);
            }
        }

        return matrix;
    }

    public static int findMaxValue(int[][] grid, int row, int col) {
        int max = Integer.MIN_VALUE;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        int[][] output1 = largestLocal(grid1); // [[9,9],[8,6]]
        System.out.println("output1 = " + Arrays.deepToString(output1));

        int[][] grid2 = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        int[][] output2 = largestLocal(grid2); // [[2,2,2],[2,2,2],[2,2,2]]
        System.out.println("output2 = " + Arrays.deepToString(output2));
    }
}
