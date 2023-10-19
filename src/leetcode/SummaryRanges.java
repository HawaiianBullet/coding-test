package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/summary-ranges/
public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int tmpNum = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) i++;

            if (tmpNum != nums[i]) {
                ans.add(tmpNum + "->" + nums[i]);
            } else {
                ans.add("" + tmpNum);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        List<String> output1 = summaryRanges(nums1); // ["0->2","4->5","7"]
        System.out.println("output1 = " + output1);

        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        List<String> output2 = summaryRanges(nums2); // ["0","2->4","6","8->9"]
        System.out.println("output2 = " + output2);
    }
}
