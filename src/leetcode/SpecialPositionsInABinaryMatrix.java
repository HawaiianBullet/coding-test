package leetcode;

// https://leetcode.com/problems/special-positions-in-a-binary-matrix/
public class SpecialPositionsInABinaryMatrix {

    public static int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1 && checkIsNumSpecial(row, col, mat, i, j)) ans++;
            }
        }

        return ans;
    }

    public static boolean checkIsNumSpecial(int row, int col, int[][] mat, int i, int j) {
        for (int k = 0; k < row; k++) {
            if (k == i) continue;
            if (mat[k][j] == 1) return false;
        }
        for (int k = 0; k < col; k++) {
            if (k == j) continue;
            if (mat[i][k] == 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        int output1 = numSpecial(mat1); // 1
        System.out.println("output1 = " + output1);

        int[][] mat2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int output2 = numSpecial(mat2); // 3
        System.out.println("output2 = " + output2);
    }
}
