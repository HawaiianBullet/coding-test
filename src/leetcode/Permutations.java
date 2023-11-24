package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/
public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTracking(result, nums, 0);
        return result;
    }

    public static void backTracking(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            result.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backTracking(result, nums, start + 1);
            swap(nums, start, i);
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> output1 = permute(nums1); // [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        System.out.println("output1 = " + output1);

        int[] nums2 = {0, 1};
        List<List<Integer>> output2 = permute(nums2); // [[0,1],[1,0]]
        System.out.println("output2 = " + output2);

        int[] nums3 = {1};
        List<List<Integer>> output3 = permute(nums3); // [[1]]
        System.out.println("output3 = " + output3);
    }
}
