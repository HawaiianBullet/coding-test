package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        int arrLength = nums.length;
        if (arrLength <= 1) return arrLength;

        Arrays.sort(nums);
        int max = 0, cnt = 1, tmp = nums[0];
        for (int i = 1; i < arrLength; i++) {
            if (tmp + 1 == nums[i]) {
                cnt++;
            } else if (tmp == nums[i]) {
              continue;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
            tmp = nums[i];
        }
        max = Math.max(max, cnt);

        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int output1 = longestConsecutive(nums1);
        System.out.println("output1 = " + output1);

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int output2 = longestConsecutive(nums2);
        System.out.println("output2 = " + output2);

        int[] nums3 = {1, 2, 0, 1};
        int output3 = longestConsecutive(nums3);
        System.out.println("output3 = " + output3);
    }

}
