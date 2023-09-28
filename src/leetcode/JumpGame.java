package leetcode;

// https://leetcode.com/problems/jump-game/
public class JumpGame {

    // 반복문을 돌면서 이전 단계에서 다음단계로 이동할 수 있는지 확인
    // 만약 이동 가능하다면 이전 단계를 target으로 변경
    // i = 0 일때, target = 0이면 canJump!
    public static boolean canJump(int[] nums) {
        int target = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= target) {
                target = i;
            }
        }

        return target == 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        boolean output1 = canJump(nums1); // true
        System.out.println("output1 = " + output1);

        int[] nums2 = {3, 2, 1, 0, 4};
        boolean output2 = canJump(nums2); // false
        System.out.println("output2 = " + output2);
    }
}
