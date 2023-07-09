package algorithm;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] output = new int[arr.length];
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            perm(arr, output, visited, 0, i + 1);
        }
    }

    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int r) {
        if (depth == r) {
            System.out.println(Arrays.toString(output));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}
