package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) break;
            else if (sum > target) right--;
            else left++;
        }

        return new int[]{left + 1, right + 1};
    }

    public static void main(String[] args) {
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] output1 = twoSum(numbers1, target1); // [1, 2]
        System.out.println("output1 = " + Arrays.toString(output1));

        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] output2 = twoSum(numbers2, target2); // [1, 3]
        System.out.println("output2 = " + Arrays.toString(output2));

        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] output3 = twoSum(numbers3, target3); // [1, 2]
        System.out.println("output3 = " + Arrays.toString(output3));
    }
}
