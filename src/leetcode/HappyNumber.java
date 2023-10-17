package leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);

            int tmp = n;
            n = 0;
            while (tmp != 0) {
                n += (int) Math.pow((tmp % 10), 2);
                tmp /= 10;
            }

            if (n == 1) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n1 = 19;
        boolean output1 = isHappy(n1); // true
        System.out.println("output1 = " + output1);

        int n2 = 2;
        boolean output2 = isHappy(n2); // false
        System.out.println("output2 = " + output2);
    }
}
