package leetcode;

// https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {

    public static int arrangeCoins(int n) {
        int num = 1;
        while (n > 0) {
            num++;
            n -= num;
        }

        return num - 1;

        // 이차방정식 근의 공식을 이용한 풀이
        // return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int output1 = arrangeCoins(n1); // 2
        System.out.println("output1 = " + output1);

        int n2 = 8;
        int output2 = arrangeCoins(n2); // 3
        System.out.println("output2 = " + output2);
    }
}
