package leetcode;

// https://leetcode.com/problems/sum-of-digits-in-base-k/
public class SumOfDigitsInBaseK {

    public static int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k;
            n /= k;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 34;
        int k1 = 6;
        int output1 = sumBase(n1, k1); // 9
        System.out.println("output1 = " + output1);

        int n2 = 10;
        int k2 = 10;
        int output2 = sumBase(n2, k2); // 1
        System.out.println("output2 = " + output2);
    }
}
