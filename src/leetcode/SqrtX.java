package leetcode;

// https://leetcode.com/problems/sqrtx/
public class SqrtX {

    public static int mySqrt(int x) {
        if (x < 2) return x;
        int left = 0, right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) return mid;
            else if (mid > x / mid) right = mid - 1;
            else left = mid + 1;
        }

        return right;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int output1 = mySqrt(x1); // 2
        System.out.println("output1 = " + output1);

        int x2 = 8;
        int output2 = mySqrt(x2); // 2
        System.out.println("output2 = " + output2);
    }
}
