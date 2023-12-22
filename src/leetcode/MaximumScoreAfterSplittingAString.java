package leetcode;

// https://leetcode.com/problems/maximum-score-after-splitting-a-string/
public class MaximumScoreAfterSplittingAString {

    public static int maxScore(String s) {
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            // left - zeros, right - ones
            int leftScore = 0, rightScore = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') leftScore++;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') rightScore++;
            }
            max = Math.max(max, leftScore + rightScore);
        }

        return max;
    }

    // 다른 사람 풀이 참고
    public static int maxScore2(String s) {
        int length = s.length();
        int ones = 0;
        int tmpScore = s.charAt(0) == '0' ? 1 : 0;
        int score = tmpScore;
        for (int i = 1; i < length - 1; i++) {
            if (s.charAt(i) == '0') {
                tmpScore += 1;
            } else {
                ones++;
                tmpScore -= 1;
            }

            if (tmpScore > score) {
                score = tmpScore;
            }
        }
        ones += (s.charAt(length - 1) == '1' ? 1 : 0);

        return ones + score;
    }

    public static void main(String[] args) {
        String s1 = "011101";
        int output1 = maxScore(s1); // 5
        System.out.println("output1 = " + output1);

        String s2 = "00111";
        int output2 = maxScore(s2); // 5
        System.out.println("output2 = " + output2);

        String s3 = "1111";
        int output3 = maxScore(s3); // 3
        System.out.println("output3 = " + output3);
    }
}
