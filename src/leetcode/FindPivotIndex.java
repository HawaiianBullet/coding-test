package leetcode;

// https://leetcode.com/problems/find-pivot-index/
public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        for (int num : nums) {
            right += num;
        }

        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right) return i;
            left += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int output1 = pivotIndex(nums1); // 3
        System.out.println("output1 = " + output1);

        int[] nums2 = {1, 2, 3,};
        int output2 = pivotIndex(nums2); // -1
        System.out.println("output2 = " + output2);

        int[] nums3 = {2, 1, -1};
        int output3 = pivotIndex(nums3); // 0
        System.out.println("output3 = " + output3);
    }
}
