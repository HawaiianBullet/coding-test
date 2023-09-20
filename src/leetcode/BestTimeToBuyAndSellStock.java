package leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

    /*
    // 이중 for문으로 해결할 경우, 시간 초과 발생
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
    */

    public static int maxProfit(int[] prices) {
        int profit = 0, buy = Integer.MAX_VALUE;
        for (int price : prices) {
            // 최소구매금액
            buy = Math.min(buy, price);
            // 최대이익금액
            profit = Math.max(profit, price - buy);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int output1 = maxProfit(prices1); // 5
        System.out.println("output1 = " + output1);

        int[] prices2 = {7, 6, 4, 3, 1};
        int output2 = maxProfit(prices2); // 0
        System.out.println("output2 = " + output2);
    }
}
