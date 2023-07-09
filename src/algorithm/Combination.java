package algorithm;

import java.util.Arrays;

public class Combination {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            comb(arr, visited, 0, 0, i + 1);
        }
    }

    public static void comb(int[] arr, boolean[] visited, int start, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                comb(arr, visited, i + 1, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}
