package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// https://leetcode.com/problems/plus-one/
public class PlusOne {

    /*
    // digits 배열을 더하는 방식으로 작성할 경우
    // 4번 케이스에서 자바에서 제공하는 int 범위를 넘어가는 문제 발생! 
    // long 타입으로 변환 작업 필요
    public static int[] plusOne(int[] digits) {
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num += (int) (digits[digits.length - 1 - i] * Math.pow(10, i));
        }
        num += 1;


        return Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
    }
     */

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int tmpNum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + tmpNum;
            if (i == digits.length - 1) {
                num += 1;
            }
            tmpNum = num / 10;
            list.add(num % 10);
        }

        if (tmpNum > 0) list.add(tmpNum);

        int[] newDigits = new int[list.size()];
        for (int i = 0; i < newDigits.length; i++) {
            newDigits[i] = list.get(newDigits.length - i - 1);
        }

        return newDigits;
    }

    // 다른 사람 풀이
    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] output1 = plusOne(digits1); // [1, 2, 4]
        System.out.println("output1 = " + Arrays.toString(output1));

        int[] digits2 = {4, 3, 2, 1};
        int[] output2 = plusOne(digits2); // [4, 3, 2, 2]
        System.out.println("output2 = " + Arrays.toString(output2));

        int[] digits3 = {9};
        int[] output3 = plusOne(digits3); // [1, 0]
        System.out.println("output3 = " + Arrays.toString(output3));

        int[] digits4 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] output4 = plusOne(digits4);
        System.out.println("output4 = " + Arrays.toString(output4));
    }
}
