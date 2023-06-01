package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12905
public class Programmers12905 {

    public static int solution(int[][] board) {
        int ans = 0;
        int row = board[0].length;
        int col = board.length;

        if (row <= 1 || col <= 1) return 1;

        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (board[i][j] >= 1) {
                    int up = board[i - 1][j];
                    int left = board[i][j - 1];
                    int upperLeft = board[i - 1][j - 1];

                    int min = Math.min(up, left);
                    min = Math.min(min, upperLeft);
                    board[i][j] = min + 1;

                    ans = Math.max(ans, min + 1);
                }
            }
        }

        return ans * ans;
    }

    public static void main(String[] args) {
        int[][] board1 = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int solution1 = solution(board1); // 9
        System.out.println("solution1 = " + solution1);

        int[][] board2 = {{0,0,1,1}, {1,1,1,1}};
        int solution2 = solution(board2); // 4
        System.out.println("solution2 = " + solution2);
    }
}
