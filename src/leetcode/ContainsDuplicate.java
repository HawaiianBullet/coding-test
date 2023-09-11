package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

/*
    // 처음 풀이
    // map을 통해 key값으로 숫자를 카운트해서 value가 1보다 크면 중복발생이라고 생각
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > 1) return true;
        }
        return false;
    }
*/

    // 다른 사람 풀이 참고
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            // set에 이미 포함되어있는 숫자를 추가할 경우, false 리턴
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 1};
        boolean output1 = containsDuplicate(input1); // true
        System.out.println("output1 = " + output1);

        int[] input2 = {1, 2, 3, 4};
        boolean output2 = containsDuplicate(input2); // false
        System.out.println("output2 = " + output2);

        int[] input3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean output3 = containsDuplicate(input3); // true
        System.out.println("output3 = " + output3);
    }
}
