package leetcode;

// https://leetcode.com/problems/count-of-matches-in-tournament/
public class CountOfMatchesInTournament {

    public static int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                count += n;
            } else {
                count += (n - 1) / 2;
                n = ((n - 1) / 2) + 1;
            }
        }

        return count;
    }

    public static int numberOfMatches2(int n) {
        int count = 0;
        while (n > 1) {
            count += n / 2;
            n = (n % 2) + (n / 2);
        }

        return count;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int output1 = numberOfMatches(n1); // 6
        System.out.println("output1 = " + output1);

        int n2 = 14;
        int output2 = numberOfMatches(n2); // 13
        System.out.println("output2 = " + output2);
    }
}
