package leetcode;

// https://leetcode.com/problems/smallest-even-multiple/
public class SmallestEvenMultiple {

    public static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int output1 = smallestEvenMultiple(n1); // 10
        System.out.println("output1 = " + output1);

        int n2 = 6;
        int output2 = smallestEvenMultiple(n2); // 6
        System.out.println("output2 = " + output2);
    }
}
