package leetcode;

// https://leetcode.com/problems/remove-element/
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] num1 = {3, 2, 2, 3};
        int val1 = 3;
        int output1 = removeElement(num1, val1); // 2
        System.out.println("output1 = " + output1);

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int output2 = removeElement(nums2, val2); // 5
        System.out.println("output2 = " + output2);
    }
}
