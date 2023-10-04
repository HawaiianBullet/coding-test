package leetcode;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        // 뭔가 이렇게 풀면 안 될 것 같은 느낌?
         return haystack.indexOf(needle);

//        int hLen = haystack.length();
//        int nLen = needle.length();
//        if (hLen < nLen) return -1;
//
//        for (int i = 0; i <= hLen - nLen; i++) {
//            if (haystack.substring(i, i + nLen).equals(needle)) return i;
//        }
//
//        return -1;
    }



    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int output1 = strStr(haystack1, needle1); // 0
        System.out.println("output1 = " + output1);

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int output2 = strStr(haystack2, needle2); // -1
        System.out.println("output2 = " + output2);

        String haystack3 = "hello";
        String needle3 = "ll";
        int output3 = strStr(haystack3, needle3); // 2
        System.out.println("output3 = " + output3);
    }
}
