package leetcode;

// https://leetcode.com/problems/add-binary/
public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        while (aIdx >= 0 || bIdx >= 0 || carry == 1) {
            if (aIdx >= 0) {
                carry += a.charAt(aIdx) - '0';
                aIdx--;
            }
            if (bIdx >= 0) {
                carry += b.charAt(bIdx) - '0';
                bIdx--;
            }
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        String output1 = addBinary(a1, b1); // "100"
        System.out.println("output1 = " + output1);

        String a2 = "1010";
        String b2 = "1011";
        String output2 = addBinary(a2, b2); // "10101"
        System.out.println("output2 = " + output2);
    }
}
