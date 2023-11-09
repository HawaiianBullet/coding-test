package leetcode;

// https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length() - 1;
        for (int i = 0; i <= n; i++) {
            ans += (int) (Math.pow(26, n - i) * (columnTitle.charAt(i) - 64));
        }

        return ans;
    }

    public static void main(String[] args) {
        String columnTitle1 = "A";
        int output1 = titleToNumber(columnTitle1); // 1
        System.out.println("output1 = " + output1);

        String columnTitle2 = "AB";
        int output2 = titleToNumber(columnTitle2); // 28
        System.out.println("output2 = " + output2);

        String columnTitle3 = "ZY";
        int output3 = titleToNumber(columnTitle3); // 701
        System.out.println("output3 = " + output3);
    }
}
