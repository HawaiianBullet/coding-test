package leetcode;

// https://leetcode.com/problems/powx-n/
public class PowXN {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        // Integer.MIN_VALUE : -2147483648
        // Integer.MAX_VALUE : 2147483647
        // n = -n 과정에서 발생할 수 있는 에러 차단
        if (n == Integer.MIN_VALUE) {
            x *= x;
            n /= 2;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double pow = myPow(x * x, n / 2);

        return n % 2 == 0 ? pow : x * pow;
    }

    // 다른 사람 풀이 참고 - 비트 연산자 활용
    public static double myPow2(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double pow = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                pow *= x;
            }
            x *= x;
            n >>>= 1;
        }

        return pow;
    }

    public static void main(String[] args) {
        double x1 = 2.00000;
        int n1 = 10;
        double output1 = myPow(x1, n1); // 1024.00000
        System.out.println("output1 = " + output1);

        double x2 = 2.10000;
        int n2 = 3;
        double output2 = myPow(x2, n2); // 9.26100
        System.out.println("output2 = " + output2);

        double x3 = 2.00000;
        int n3 = -2;
        double output3 = myPow(x3, n3); // 0.25000
        System.out.println("output3 = " + output3);
    }
}
