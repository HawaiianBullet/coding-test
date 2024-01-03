package leetcode;

public class NumberOfLaserBeamsInABank {

    public static int numberOfBeams(String[] bank) {
        int ans = 0, tmp = 0;
        for (String str : bank) {
            int n = str.replaceAll("[^1]", "").length();
            if (n == 0) continue;
            ans += tmp * n;
            tmp = n;
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] bank1 = {"011001", "000000", "010100", "001000"};
        int output1 = numberOfBeams(bank1); // 8
        System.out.println("output1 = " + output1);

        String[] bank2 = {"000", "111", "000"};
        int output2 = numberOfBeams(bank2); // 0
        System.out.println("output2 = " + output2);
    }
}
