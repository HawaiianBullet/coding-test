package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) set.add(nums1[i]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer num1 : nums1) {
            set1.add(num1);
        }

        for (int num2 : nums2) {
            if (set1.contains(num2)) set2.add(num2);
        }

        return set2.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums11 = {1, 2, 2, 1};
        int[] nums12 = {2, 2};
        int[] output1 = intersection(nums11, nums12); // [2]
        System.out.println("output1 = " + Arrays.toString(output1));

        int[] nums21 = {4, 9, 5};
        int[] nums22 = {9, 4, 9, 8, 4};
        int[] output2 = intersection(nums21, nums22); // [9, 4]
        System.out.println("output2 = " + Arrays.toString(output2));
    }
}
