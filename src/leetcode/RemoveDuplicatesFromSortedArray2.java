package leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class RemoveDuplicatesFromSortedArray2 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int idx = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[idx - 2]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int output1 = removeDuplicates(nums1); // 5
        System.out.println("output1 = " + output1);

        int[] nums2 = {1, 2, 3};
        int output2 = removeDuplicates(nums2); // 3
        System.out.println("output2 = " + output2);

        int[] nums3 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int output3 = removeDuplicates(nums3); // 7
        System.out.println("output3 = " + output3);
    }
}
