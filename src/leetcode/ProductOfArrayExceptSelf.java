package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        /*
        // 이중 for문을 돌면서 해당 인덱스는 제외하고 곱하면 되겠다는 단순한 생각
        // timeout 에러 발생
        for (int i = 0; i < nums.length; i++) {
            int tmpNum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                tmpNum *= nums[j];
            }
            ans[i] = tmpNum;
        }
        */

        // 풀이 참고
        // 해당 인덱스의 이전 전체 곱한 값 (prev) * 이후 전체 곱한 값 (post)
        int prev = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prev;
            prev *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= post;
            post *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] output1 = productExceptSelf(nums1);
        System.out.println("output1 = " + Arrays.toString(output1));

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] output2 = productExceptSelf(nums2);
        System.out.println("output2 = " + Arrays.toString(output2));
    }
}
