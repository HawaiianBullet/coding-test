package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/image-smoother/
public class ImageSmoother {

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] smootherImg = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, cnt = 0;
//                for (int k = Math.max(0, i - 1); k < Math.min(m, i + 2); k++) {
//                    for (int l = Math.max(0, j - 1); l < Math.min(n, j + 2); l++) {
                for (int k = i - 1; k < i + 2; k++) {
                    for (int l = j - 1; l < j + 2; l++) {
                        if (k < 0 || k > m - 1 || l < 0 || l > n - 1) continue;
                        cnt++;
                        sum += img[k][l];
                    }
                }
                smootherImg[i][j] = sum / cnt;
            }
        }
        return smootherImg;
    }

    public static void main(String[] args) {
        int[][] img1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] output1 = imageSmoother(img1); // [[0,0,0],[0,0,0],[0,0,0]]
        System.out.println("output1 = " + Arrays.deepToString(output1));

        int[][] img2 = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        int[][] output2 = imageSmoother(img2); // [[137,141,137],[141,138,141],[137,141,137]]
        System.out.println("output2 = " + Arrays.deepToString(output2));
    }
}
