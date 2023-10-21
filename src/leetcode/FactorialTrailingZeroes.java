package leetcode;

// https://leetcode.com/problems/factorial-trailing-zeroes/
public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        if (n < 5) return 0;

        int cnt = 0;
//        // n까지 반복문을 돌면서 5로 나눠지는지 카운트
//        for (int i = 5; i <= n; i++) {
//            int num = i;
//            while (num % 5 == 0) {
//                cnt++;
//                num /= 5;
//            }
//        }
        // 개선 - for문을 사용하지 않는 방식
        // n을 5로 나눈 몫을 더하는 방식
        while (n != 0) {
            n /= 5;
            cnt += n;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int output1 = trailingZeroes(n1); // 0
        System.out.println("output1 = " + output1);

        int n2 = 5;
        int output2 = trailingZeroes(n2); // 1
        System.out.println("output2 = " + output2);

        int n3 = 0;
        int output3 = trailingZeroes(n3); // 0
        System.out.println("output3 = " + output3);
    }
}
