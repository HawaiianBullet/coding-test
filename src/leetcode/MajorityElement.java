package leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0, cnt = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > cnt) {
                cnt = map.get(key);
                ans = key;
            }
        }

        return ans;
    }


/*
    // 다른 사람 풀이 참고
    // majorityElement는 배열의 절반이상 포함되기때문에 정렬한 다음 중간값 리턴
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
*/

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int output1 = majorityElement(nums1); // 3
        System.out.println("output1 = " + output1);

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int output2 = majorityElement(nums2); // 2
        System.out.println("output2 = " + output2);
    }
}
