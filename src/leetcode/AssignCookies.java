package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/
public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0, i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        int output1 = findContentChildren(g1, s1); // 1
        System.out.println("output1 = " + output1);

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        int output2 = findContentChildren(g2, s2); // 2
        System.out.println("output2 = " + output2);
    }
}
