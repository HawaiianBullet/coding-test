package leetcode;

// https://leetcode.com/problems/house-robber/
public class HouseRobber {

    // dp배열을 만들어서 사용하는 풀이
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }

    // 배열을 사용하지 않는 풀이
    public static int rob2(int[] nums) {
        int curr = nums[0], prev1 = nums[0], prev2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int tmpSum1 = prev1;
            int tmpSum2 = nums[i] + prev2;
            curr = Math.max(tmpSum1, tmpSum2);
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int output1 = rob(nums1); // 4
        System.out.println("output1 = " + output1);

        int[] nums2 = {2, 7, 9, 3, 1};
        int output2 = rob(nums2); // 12
        System.out.println("output2 = " + output2);
    }
}
