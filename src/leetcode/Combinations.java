package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/
public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTracking(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    public static void backTracking(List<List<Integer>> result, List<Integer> list, int start, int n, int k) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n && list.size() < k; i++) {
            list.add(i);
            backTracking(result, list, i + 1, n, k);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n1 = 4, k1 = 2;
        List<List<Integer>> output1 = combine(n1, k1); // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
        System.out.println("output1 = " + output1);

        int n2 = 1, k2 = 1;
        List<List<Integer>> output2 = combine(n2, k2); // [[1]]
        System.out.println("output2 = " + output2);
    }
}
