package leetcode;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

    /*
    // 이중 for문으로 풀 경우, 시간 초과 발생
    public static int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int left = height[i];
            for (int j = i + 1; j < height.length; j++) {
                int right = height[j];
                int minHeight = Math.min(left, right);
                maxWater = Math.max(maxWater, minHeight * (j - i));
            }
        }
        return maxWater;
    }
    */

    // Two Pointer
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(currentArea, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int output1 = maxArea(height1); // 49
        System.out.println("output1 = " + output1);

        int[] height2 = {1, 1};
        int output2 = maxArea(height2); // 1
        System.out.println("output2 = " + output2);
    }
}
