package leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key) && Math.abs(map.get(key) - i) <= k) {
                return true;
            }
            map.put(key, i);
        }

        return false;
    }

    // 다른 사람 풀이 참고
    // 반복문을 돌면서 i ~ i + k 까지 set 함수를 이동하면서 동일한 값이 추가되면
    // set.add(nums[i]) 값이 false가 리턴됨으로 이 경우 containsNearbyDuplicate!
    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        boolean output1 = containsNearbyDuplicate(nums1, k1); // true
        System.out.println("output1 = " + output1);

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        boolean output2 = containsNearbyDuplicate(nums2, k2); // true
        System.out.println("output2 = " + output2);

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        boolean output3 = containsNearbyDuplicate(nums3, k3); // false
        System.out.println("output3 = " + output3);
    }
}
