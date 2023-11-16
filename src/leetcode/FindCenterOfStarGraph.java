package leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/find-center-of-star-graph/
public class FindCenterOfStarGraph {

    public static int findCenter(int[][] edges) {
//        Set<Integer> set = new HashSet<>();
//        for (int[] edge : edges) {
//            if (!set.add(edge[0])) return edge[0];
//            if (!set.add(edge[1])) return edge[1];
//        }
//
//        return 3;

        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]
                ? edges[0][0]
                : edges[0][1];
    }

    public static void main(String[] args) {
        int[][] edges1 = {{1, 2}, {2, 3}, {4, 2}};
        int output1 = findCenter(edges1); // 2
        System.out.println("output1 = " + output1);

        int[][] edges2 = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        int output2 = findCenter(edges2); // 1
        System.out.println("output2 = " + output2);
    }
}
