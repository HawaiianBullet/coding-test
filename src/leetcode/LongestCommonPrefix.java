package leetcode;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//        if (strs.length == 1) return strs[0];
//
//        // strs 배열 각 문자열 크기로 오름차순 정렬
//        Arrays.sort(strs, Comparator.comparingInt(String::length));
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < strs[0].length(); i++) {
//            // 배열의 첫 문자열을 기준으로 다른 문자열 비교
//            char compChar = strs[0].charAt(i);
//            for (int j = 1; j < strs.length; j++) {
//                // 비교값이 다를 경우 리턴
//                if (compChar != strs[j].charAt(i)) return sb.toString();
//            }
//            // 각 문자열이 모두 동일한 값을 포함하고 있다면 해당값 추가
//            sb.append(compChar);
//        }
//
//        return sb.toString();
//    }

    // 다른 사람 풀이
    public static String longestCommonPrefix(String[] strs) {
        // 각 문자열 알파벳 순으로 정렬
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int idx = 0;
        // 처음과 마지막 문자열을 비교
        while (idx < str1.length() && idx < str2.length()) {
            if (str1.charAt(idx) == str2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return str1.substring(0, idx);
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String output1 = longestCommonPrefix(strs1); // "fl"
        System.out.println("output1 = " + output1);


        String[] strs2 = {"dog", "racecar", "car"};
        String output2 = longestCommonPrefix(strs2); // ""
        System.out.println("output2 = " + output2);
    }
}
