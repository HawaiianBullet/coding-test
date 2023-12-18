package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class MaximumProductDifferenceBetweenTwoPairs {

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 6, 2, 7, 4};
        int output1 = maxProductDifference(nums1); // 34
        System.out.println("output1 = " + output1);

        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        int output2 = maxProductDifference(nums2); // 64
        System.out.println("output2 = " + output2);
    }
}
