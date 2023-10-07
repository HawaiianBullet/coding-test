package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

// https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {

    public static String intToRoman(int num) {
        // 경우의 수 초기화 + HashMap 입력 순서 보장을 위해 LinkedHashMap 사용
        Map<String, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put("M", 1000);
        romanMap.put("CM", 900);
        romanMap.put("D", 500);
        romanMap.put("CD", 400);
        romanMap.put("C", 100);
        romanMap.put("XC", 90);
        romanMap.put("L", 50);
        romanMap.put("XL", 40);
        romanMap.put("X", 10);
        romanMap.put("IX", 9);
        romanMap.put("V", 5);
        romanMap.put("IV", 4);
        romanMap.put("I", 1);

        StringBuilder sb = new StringBuilder();
        for (String romanStr : romanMap.keySet()) {
            int romanNum = romanMap.get(romanStr);
            while (num >= romanNum) {
                sb.append(romanStr);
                num -= romanNum;
            }
        }

        return sb.toString();
    }

    // 다른 사람 풀이 roman 경우의 수를 map이 아닌 각 배열로 관리하고 while문 하나로 처리
//    public static String intToRoman(int num) {
//        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//
//        StringBuilder sb = new StringBuilder();
//
//        int i = 0;
//
//        while (num > 0) {
//            if (num >= values[i]) {
//
//                sb.append(romanNumerals[i]);
//                num -= values[i];
//            } else {
//                i++;
//            }
//        }
//
//        return sb.toString();
//    }

    public static void main(String[] args) {
        int num1 = 3;
        String output1 = intToRoman(num1); // "III"
        System.out.println("output1 = " + output1);

        int num2 = 58;
        String output2 = intToRoman(num2); // "LVIII"
        System.out.println("output2 = " + output2);

        int num3 = 1994;
        String output3 = intToRoman(num3); // "MCMXCIV"
        System.out.println("output3 = " + output3);
    }
}
