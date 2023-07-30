package baekjoon.codingtest.practice.bruteforce;

import java.util.Scanner;

// https://www.acmicpc.net/problem/6603
public class BOJ6603 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int[] arr = new int[n];
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            comb(arr, visited, 0, 0, 6);
            System.out.println();
        }
    }
}