package leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
public class MinimumNumberOfOperationsToMakeArrayEmpty {

    // 배열에서 같은 요소 2개 또는 3개씩 제거 가능
    /*
    1: -1
    2: 2
    3: 3
    4: 2 + 2
    5: 3 + 2
    6: 3 + 3
    7: 3 + 2 + 2
    8: 3 + 3 + 2
    9: 3 + 3 + 3
    10: 3 + 3 + 2 + 2
    11: 3 + 3 + 3 + 2
    12: 3 + 3 + 3 + 3
    13: 3 + 3 + 3 + 2 + 2
     */
    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : map.values()) {
            if (num == 1) return -1;
            count += num / 3;
            if (num % 3 != 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        int output1 = minOperations(nums1); // 4
        System.out.println("output1 = " + output1);

        int[] nums2 = {2, 1, 2, 2, 3, 3};
        int output2 = minOperations(nums2); // -1
        System.out.println("output2 = " + output2);

        int[] nums3 = {14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12};
        int output3 = minOperations(nums3); // 7
        System.out.println("output3 = " + output3);
    }
}