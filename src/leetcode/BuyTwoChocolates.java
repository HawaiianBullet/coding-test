package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/buy-two-chocolates/
public class BuyTwoChocolates {

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int chocoSum = prices[0] + prices[1];
        int change = money - chocoSum;
        return change >= 0 ? change : money;
    }

    public static void main(String[] args) {
        int[] prices1 = {1, 2, 2};
        int money1 = 3;
        int output1 = buyChoco(prices1, money1); // 0
        System.out.println("output1 = " + output1);

        int[] prices2 = {3, 2, 3};
        int money2 = 3;
        int output2 = buyChoco(prices2, money2); // 3
        System.out.println("output2 = " + output2);
    }
}
