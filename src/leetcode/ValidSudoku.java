package leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        // 가로 확인
        for (int i = 0; i < 9; i++) {
            boolean[] checkValidArr = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                else if (checkValidArr[ch - '1']) return false;
                else checkValidArr[ch - '1'] = true;
            }
        }

        // 세로 확인
        for (int i = 0; i < 9; i++) {
            boolean[] checkValidArr = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch == '.') continue;
                else if (checkValidArr[ch - '1']) return false;
                else checkValidArr[ch - '1'] = true;
            }
        }

        // 3*3 확인
        for (int i = 0; i < 9; i++) {
            boolean[] checkValidArr = new boolean[9];
            for (int j = i / 3 * 3; j < i / 3 * 3 + 3; j++) {
                for (int k = i % 3 * 3; k < i % 3 * 3 + 3; k++) {
                    char ch = board[j][k];
                    if (ch == '.') continue;
                    else if (checkValidArr[ch - '1']) return false;
                    else checkValidArr[ch - '1'] = true;
                }
            }
        }

        return true;
    }

    // 다른 사람 풀이 참고
    // 가로, 세로, 3*3 케이스 문자열 Set 자료 구조를 이용해서 한 번에 관리
    public static boolean isValidSudoku2(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (!set.add(current + "found in row" + i) ||
                            !set.add(current + "found in column" + j) ||
                            !set.add(current + "found in sub-box" + i / 3 + "," + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean output1 = isValidSudoku(board1); // true
        System.out.println("output1 = " + output1);

        char[][] board2 = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean output2 = isValidSudoku(board2); // false
        System.out.println("output2 = " + output2);
    }
}
