package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // 이전 시작점과 동일하면 패스
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ansList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // left 포인터가 동일할 경우 패스
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // right 포인터가 동일할 경우 패스
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output1 = threeSum(nums1); // [[-1,-1,2],[-1,0,1]]
        System.out.println("output1 = " + output1);

        int[] nums2 = {0,1,1};
        List<List<Integer>> output2 = threeSum(nums2); // []
        System.out.println("output2 = " + output2);

        int[] nums3 = {0,0,0};
        List<List<Integer>> output3 = threeSum(nums3); // [[0,0,0]]
        System.out.println("output3 = " + output3);
    }
}
