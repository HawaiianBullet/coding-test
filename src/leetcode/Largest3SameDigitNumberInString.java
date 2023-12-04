package leetcode;

// https://leetcode.com/problems/largest-3-same-digit-number-in-string/
public class Largest3SameDigitNumberInString {

    public static String largestGoodInteger(String num) {
        int result = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                result = Math.max(result, num.charAt(i) - '0');
            }
        }

        return result == -1 ? "" : String.valueOf(result).repeat(3);
    }

    public static void main(String[] args) {
        String num1 = "6777133339";
        String output1 = largestGoodInteger(num1); // "777"
        System.out.println("output1 = " + output1);

        String num2 = "2300019";
        String output2 = largestGoodInteger(num2); // "000"
        System.out.println("output2 = " + output2);

        String num3 = "42352338";
        String output3 = largestGoodInteger(num3); // ""
        System.out.println("output3 = " + output3);
    }
}
