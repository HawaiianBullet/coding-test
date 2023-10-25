package leetcode;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
//            int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int output1 = searchInsert(nums1, target1); // 2
        System.out.println("output1 = " + output1);

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int output2 = searchInsert(nums2, target2); // 1
        System.out.println("output2 = " + output2);

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int output3 = searchInsert(nums3, target3); // 4
        System.out.println("output3 = " + output3);
    }
}
