package leetcode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://leetcode.com/problems/search-a-2d-matrix/
public class SearchA2DMatrix {

    // 다른사람 풀이 참고
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;

        while (i >= 0 && i < row && j >= 0 && j < col) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) j--;
            else i++;
        }

        return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        int[] nums = Stream.of(matrix)
                .flatMapToInt(IntStream::of)
                .toArray();
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target1 = 3;
        boolean output1 = searchMatrix(matrix1, target1); // true
        System.out.println("output1 = " + output1);

        int[][] matrix2 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target2 = 13;
        boolean output2 = searchMatrix(matrix2, target2); // false
        System.out.println("output2 = " + output2);
    }
}
