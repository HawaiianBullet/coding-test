package leetcode;

// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array
public class ElementAppearingMoreThen25InSortedArray {

    public static int findSpecialInteger(int[] arr) {
        int n = arr.length, quarter = n / 4;
        for (int i = 0; i < n - quarter; i++) {
            if (arr[i] == arr[i + quarter]) return arr[i];
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int output1 = findSpecialInteger(arr1); // 6
        System.out.println("output1 = " + output1);

        int[] arr2 = {1, 1};
        int output2 = findSpecialInteger(arr2); // 1
        System.out.println("output2 = " + output2);

        int[] arr3 = {1, 2, 3, 3};
        int output3 = findSpecialInteger(arr3); // 3
        System.out.println("output3 = " + output3);
    }
}
