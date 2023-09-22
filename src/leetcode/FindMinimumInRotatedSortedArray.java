package leetcode;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int output1 = findMin(nums1); // 1
        System.out.println("output1 = " + output1);

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int output2 = findMin(nums2); // 0
        System.out.println("output2 = " + output2);

        int[] nums3 = {11, 13, 15, 17};
        int output3 = findMin(nums3); // 11
        System.out.println("output3 = " + output3);
    }
}
