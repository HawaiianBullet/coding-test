package leetcode;

// https://leetcode.com/problems/calculate-money-in-leetcode-bank/
public class CalculateMoneyInLeetcodeBank {

    public int totalMoney2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int d = i / 7;
            int r = i % 7;
            if (r == 0) d += 6;
            sum += d + r;
        }

        return sum;
    }

    public static int totalMoney(int n) {
        int week = n / 7;
        int days = n % 7;
        int total = week * 28;
        total += ((week * (week - 1)) / 2) * 7;
        total += ((days * (days + 1)) / 2) + (week * days);

        return total;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int output1 = totalMoney(n1); // 10
        System.out.println("output1 = " + output1);

        int n2 = 10;
        int output2 = totalMoney(n2); // 37
        System.out.println("output2 = " + output2);

        int n3 = 20;
        int output3 = totalMoney(n3); // 96
        System.out.println("output3 = " + output3);
    }
}
