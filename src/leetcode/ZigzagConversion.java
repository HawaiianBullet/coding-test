package leetcode;

// https://leetcode.com/problems/zigzag-conversion/
public class ZigzagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            int jump = row;
            while (jump < s.length()) {
                sb.append(s.charAt(jump));
                if (row > 0 && row < numRows - 1) {
                    int tmpJump = jump + (2 * (numRows - 1 - row));
                    if (tmpJump < s.length()) sb.append(s.charAt(tmpJump));
                }
                jump += 2 * (numRows - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String output1 = convert(s1, numRows1); // "PAHNAPLSIIGYIR"
        System.out.println("output1 = " + output1);

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        String output2 = convert(s2, numRows2); // "PINALSIGYAHRPI"
        System.out.println("output2 = " + output2);

        String s3 = "A";
        int numRows3 = 1;
        String output3 = convert(s3, numRows3); // "A"
        System.out.println("output3 = " + output3);
    }
}
