package leetcode;

// https://leetcode.com/problems/valid-mountain-array/
public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int asc = 0, desc = arr.length - 1;
        while (asc + 1 < arr.length - 1 && arr[asc] < arr[asc + 1]) asc++;
        while (desc - 1 > 0 && arr[desc] < arr[desc - 1]) desc--;

        return asc == desc;
    }

    public static boolean validMountainArray2(int[] arr) {
        int n = arr.length, maxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        if (maxIdx == 0 || maxIdx == n - 1) return false;

        for (int i = 0; i < maxIdx; i++) {
            if (arr[i] >= arr[i + 1]) return false;
        }
        for (int i = maxIdx; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        boolean output1 = validMountainArray(arr1); // false
        System.out.println("output1 = " + output1);

        int[] arr2 = {3, 5, 5};
        boolean output2 = validMountainArray(arr2); // false
        System.out.println("output2 = " + output2);

        int[] arr3 = {0, 3, 2, 1,};
        boolean output3 = validMountainArray(arr3); // true
        System.out.println("output3 = " + output3);

        int[] arr4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean output4 = validMountainArray(arr4); // false
        System.out.println("output4 = " + output4);

        int[] arr5 = {1, 3, 2};
        boolean output5 = validMountainArray(arr5); // true
        System.out.println("output5 = " + output5);
    }
}
