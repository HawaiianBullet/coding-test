package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/single-number/
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            } else {
                list.remove(Integer.valueOf(nums[i]));
            }
        }

        return list.get(0);
    }

    // 다른 사람 풀이 참고 - Bit 연산자 사용
    public static int singleNumber2(int[] nums) {
        if (nums.length == 1) return nums[0];

        int ans = 0; // since XOR with 0 returns same number
        for (int num : nums) {
            ans ^= num; // ans = (ans) XOR (array element at i)
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int output1 = singleNumber(nums1); // 1
        System.out.println("output1 = " + output1);

        int[] nums2 = {4, 1, 2, 1, 2};
        int output2 = singleNumber(nums2); // 4
        System.out.println("output2 = " + output2);

        int[] nums3 = {1};
        int output3 = singleNumber(nums3); // 1
        System.out.println("output3 = " + output3);
    }
}
