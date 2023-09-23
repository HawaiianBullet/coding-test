package leetcode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

       while (left <= right) {
           int mid = (left + right) / 2;

           if (nums[mid] == target) return mid;

           if (nums[left] <= nums[mid]) {
               if (nums[left] <= target && target < nums[mid]) {
                   right = mid - 1;
               } else {
                   left = mid + 1;
               }
           } else {
               if (nums[mid] < target && target <= nums[right]) {
                   left = mid + 1;
               } else {
                   right = mid - 1;
               }
           }

       }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int output1 = search(nums1, target1); // 4
        System.out.println("output1 = " + output1);

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        int output2 = search(nums2, target2); // -1
        System.out.println("output2 = " + output2);

        int[] nums3 = {1};
        int target3 = 0;
        int output3 = search(nums3, target3); // -1
        System.out.println("output3 = " + output3);

        int[] nums4 = {1, 3};
        int target4 = 1;
        int output4 = search(nums4, target4); // 0
        System.out.println("output4 = " + output4);

        int[] nums5 = {1};
        int target5 = 1;
        int output5 = search(nums5, target5); // 0
        System.out.println("output5 = " + output5);
    }
}
