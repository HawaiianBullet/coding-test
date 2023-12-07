package leetcode;

// https://leetcode.com/problems/largest-odd-number-in-string/
public class LargestOddNumberInString {

    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int lastNum = num.charAt(i) - '0';
            if (lastNum % 2 != 0) return num.substring(0, i + 1);
        }
        
        return "";
    }

    public static void main(String[] args) {
        String num1 = "52";
        String output1 = largestOddNumber(num1); // "5"
        System.out.println("output1 = " + output1);

        String num2 = "4206";
        String output2 = largestOddNumber(num2); // ""
        System.out.println("output2 = " + output2);

        String num3 = "35427";
        String output3 = largestOddNumber(num3); // "35427"
        System.out.println("output3 = " + output3);
    }
}
