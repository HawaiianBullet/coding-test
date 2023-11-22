package leetcode;

// https://leetcode.com/problems/ugly-number/
public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 6;
        boolean output1 = isUgly(n1); // true
        System.out.println("output1 = " + output1);

        int n2 = 1;
        boolean output2 = isUgly(n2); // true
        System.out.println("output2 = " + output2);

        int n3 = 14;
        boolean output3 = isUgly(n3); // false
        System.out.println("output3 = " + output3);
    }
}
