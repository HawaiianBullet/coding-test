package leetcode;

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(list.size() - i - 1).getKey();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] output1 = topKFrequent(nums1, k1);
        System.out.println("output1 = " + Arrays.toString(output1));

        int[] nums2 = {1};
        int k2 = 1;
        int[] output2 = topKFrequent(nums2, k2);
        System.out.println("output2 = " + Arrays.toString(output2));
    }
}
