package leetcode;

import java.util.*;

// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {

    /*
    다른 사람 풀이 참고
    for문을 돌면서 각 문자열을 가져와서 정렬한 다음
    정렬된 문자열을 Map 자료구조의 key로 활용해서 Anagram 확인
    */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }


        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output1 = groupAnagrams(strs1);
        System.out.println("output1 = " + output1);

        String[] strs2 = {""};
        List<List<String>> output2 = groupAnagrams(strs2);
        System.out.println("output2 = " + output2);

        String[] strs3 = {"a"};
        List<List<String>> output3 = groupAnagrams(strs3);
        System.out.println("output3 = " + output3);
    }
}
