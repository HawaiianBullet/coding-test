package leetcode;

// https://leetcode.com/problems/gas-station/
public class GasStation {

    // 첫 풀이 - Time Limit Exceeded...
//    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        int ans = -1;
//        int len = gas.length;
//
//        for (int i = 0; i < len; i++) {
//            int totalGas = 0;
//            for (int j = i; j < i + len; j++) {
//                int idx = j % len;
//                totalGas += gas[idx] -cost[idx];
//                if (totalGas < 0) break;
//                if (j == i + len - 1 && totalGas >= 0) return i;
//            }
//        }
//
//        return ans;
//    }

    // 다른 사람 풀이 참고
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, total = 0, remain = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            remain += diff;
            total += diff;
            if (remain < 0) {
                remain = 0;
                start = i + 1;
            }
        }

        return total >= 0 ? start : -1;

    }

    public static void main(String[] args) {
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2,};
        int output1 = canCompleteCircuit(gas1, cost1); // 3
        System.out.println("output1 = " + output1);

        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        int output2 = canCompleteCircuit(gas2, cost2); // -1
        System.out.println("output2 = " + output2);
    }
}
