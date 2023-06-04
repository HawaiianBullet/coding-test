package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12913
public class Programmers12913 {

    public static int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }

        int answer = 0;
        for (int num : land[land.length - 1]) {
            answer = Math.max(answer, num);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        int solution = solution(land); // 16
        System.out.println("solution = " + solution);

        int[][] tmpLand = {{1, 1, 3, 1}, {2, 3, 2, 2}, {1, 4, 1, 1}};
        int solution1 = solution(tmpLand);
        System.out.println("solution1 = " + solution1);
    }

}
