package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        // k가 nums 배열 크기보다 클 경우, 반복적인 rotate 방지를 위해 나머지 값으로 대체
        k = k % nums.length;
        // nums 배열 전체 reverse
        reverse(nums, 0 , nums.length - 1);
        // nums 배열 k이전 reverse
        reverse(nums, 0 , k - 1);
        // nums 배열 k부터 reverse
        reverse(nums, k , nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1); // [5,6,7,1,2,3,4]

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2); // [3,99,-1,-100]
    }
}
