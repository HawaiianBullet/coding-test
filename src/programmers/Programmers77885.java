package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/77885
public class Programmers77885 {

    /*
    짝수일 경우 - 숫자 + 1
    홀수일 경우 - 이진수 문자열에서 마지막 "01"을 찾아서 "10"으로 교환
               만약 이진수 문자열에 01이 없을 경우 맨 앞 "1" --> "01"로 교환
     */
    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
            } else {
                String binaryStr = Long.toBinaryString(numbers[i]);
                int tmpIdx = binaryStr.lastIndexOf("01");
                StringBuilder sb = new StringBuilder(binaryStr);
                if (tmpIdx < 0) {
                    sb.replace(0, 1, "10");
                } else {
                    sb.replace(tmpIdx, tmpIdx + 2, "10");
                }
                answer[i] = Long.parseLong(sb.toString(), 2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long[] numbers = {2, 7};
        long[] solution = solution(numbers); // {3, 11}
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
