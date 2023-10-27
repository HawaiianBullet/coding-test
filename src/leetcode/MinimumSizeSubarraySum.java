package leetcode;

// https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int left = 0, right = 0, sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int output1 = minSubArrayLen(target1, nums1); // 2
        System.out.println("output1 = " + output1);

        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        int output2 = minSubArrayLen(target2, nums2); // 1
        System.out.println("output2 = " + output2);

        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int output3 = minSubArrayLen(target3, nums3); // 0
        System.out.println("output3 = " + output3);

        int target4 = 11;
        int[] nums4 = {1, 2, 3, 4, 5};
        int output4 = minSubArrayLen(target4, nums4); // 3
        System.out.println("output4 = " + output4);
    }
}
