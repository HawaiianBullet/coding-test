package leetcode;

// https://leetcode.com/problems/license-key-formatting/
public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase();
        s = s.replaceAll("-", "");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1, count = 0; i >= 0; i--) {
            if (count == k) {
                sb.append('-');
                count = 0;
            }
            sb.append(s.charAt(i));
            count++;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        String output1 = licenseKeyFormatting(s1, k1); // "5F3Z-2E9W"
        System.out.println("output1 = " + output1);

        String s2 = "2-5g-3-J";
        int k2 = 2;
        String output2 = licenseKeyFormatting(s2, k2); // "2-5G-3J"
        System.out.println("output2 = " + output2);
    }
}
