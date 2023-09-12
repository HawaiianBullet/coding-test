package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // current + x = target
            // x = target - current
            int x = target - current;
            if (map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            map.put(current, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] twoSum1 = twoSum(nums1, target1);
        System.out.println("twoSum1 = " + Arrays.toString(twoSum1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] twoSum2 = twoSum(nums2, target2);
        System.out.println("twoSum2 = " + Arrays.toString(twoSum2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] twoSum3 = twoSum(nums3, target3);
        System.out.println("twoSum3 = " + Arrays.toString(twoSum3));
    }
}
