package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] transposedMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] output1 = transpose(matrix1); // [[1,4,7],[2,5,8],[3,6,9]
        System.out.println("output1 = " + Arrays.deepToString(output1));

        int[][] matrix2 = {{1, 2, 3,}, {4, 5, 6}};
        int[][] output2 = transpose(matrix2); // [[1,4],[2,5],[3,6]]
        System.out.println("output2 = " + Arrays.deepToString(output2));
    }
}
