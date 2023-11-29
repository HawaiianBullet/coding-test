package leetcode;

// https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {

    // https://www.techiedelight.com/brian-kernighans-algorithm-count-set-bits-integer/
    public static int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            n = n & (n - 1);
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n1 = 11;
        int output1 = hammingWeight(n1); // 3
        System.out.println("output1 = " + output1);

        int n2 = 128;
        int output2 = hammingWeight(n2); // 1
        System.out.println("output2 = " + output2);

        int n3 = -3;
        int output3 = hammingWeight(n3); // 31
        System.out.println("output3 = " + output3);
    }
}
