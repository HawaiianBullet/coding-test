package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            System.out.println("num = " + num);
            int start = 0, end = size;
            while (start != end) {
                int mid = start + (end - start) / 2;
                if (dp[mid] < num) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            dp[start] = num;
            if (start == size) size++;
            System.out.println("dp = " + Arrays.toString(dp));
        }

        return size;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int output1 = lengthOfLIS(nums1); // 4
        System.out.println("output1 = " + output1);

//        int[] nums2 = {0, 1, 0, 3, 2, 3};
//        int output2 = lengthOfLIS(nums2); // 4
//        System.out.println("output2 = " + output2);
//
//        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
//        int output3 = lengthOfLIS(nums3); // 1
//        System.out.println("output3 = " + output3);
    }
}
