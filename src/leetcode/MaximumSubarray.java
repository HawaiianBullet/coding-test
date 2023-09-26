package leetcode;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int tmpSum = 0;
//            for (int j = i; j < nums.length; j++) {
//                tmpSum += nums[j];
//                maxSum = Math.max(maxSum, tmpSum);
//            }
//        }
//        return maxSum;

        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int output1 = maxSubArray(nums1); // 6
        System.out.println("output1 = " + output1);

        int[] nums2 = {1};
        int output2 = maxSubArray(nums2); // 1
        System.out.println("output2 = " + output2);

        int[] num3 = {5, 4, -1, 7, 8};
        int output3 = maxSubArray(num3); // 23
        System.out.println("output3 = " + output3);
    }
}
