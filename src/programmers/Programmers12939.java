package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12936
public class Programmers12939 {

    public static String solution(String s) {
        String[] sArr = s.split(" ");
        int min, max, tmpNum;
        min = max = Integer.parseInt(sArr[0]);
        for (int i = 1; i < sArr.length; i++) {
            tmpNum = Integer.parseInt(sArr[i]);
            if (min > tmpNum) min = tmpNum;
            if (max < tmpNum) max = tmpNum;
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        String s1 = "1 2 3 4";
        String solution1 = solution(s1); // "1 4"
        System.out.println("solution1 = " + solution1);

        String s2 = "-1 -2 -3 -4";
        String solution2 = solution(s2);
        System.out.println("solution2 = " + solution2);

        String s3 = "-1 -1";
        String solution3 = solution(s3);
        System.out.println("solution3 = " + solution3);
    }
}
