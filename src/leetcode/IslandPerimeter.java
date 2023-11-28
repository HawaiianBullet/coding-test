package leetcode;

// https://leetcode.com/problems/island-perimeter/
public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) continue;
                sum += 4;
                if (i - 1 >= 0 && grid[i - 1][j] == 1) sum--;
                if (i + 1 < row && grid[i + 1][j] == 1) sum--;
                if (j - 1 >= 0 && grid[i][j - 1] == 1) sum--;
                if (j + 1 < col &&grid[i][j + 1] == 1) sum--;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int output1 = islandPerimeter(grid1); // 16
        System.out.println("output1 = " + output1);

        int[][] grid2 = {{1}};
        int output2 = islandPerimeter(grid2); // 4
        System.out.println("output2 = " + output2);

        int[][] grid3 = {{1, 0}};
        int output3 = islandPerimeter(grid3); // 4
        System.out.println("output3 = " + output3);
    }
}
