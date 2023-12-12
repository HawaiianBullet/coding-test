package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MaximumProductOfTwoElementsInAnArray {

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        return (a - 1) * (b - 1);
    }

    public static int maxProduct2(int[] nums) {
        int n = nums.length, max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 2};
        int output1 = maxProduct(nums1); // 12
        System.out.println("output1 = " + output1);

        int[] nums2 = {1, 5, 4, 5};
        int output2 = maxProduct(nums2); // 16
        System.out.println("output2 = " + output2);

        int[] nums3 = {3, 7};
        int output3 = maxProduct(nums3); // 12
        System.out.println("output3 = " + output3);
    }
}
