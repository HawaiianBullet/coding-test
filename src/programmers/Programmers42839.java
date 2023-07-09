package programmers;

import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/42839
public class Programmers42839 {

    static Set<Integer> set = new HashSet<>();

    public static int solution(String numbers) {
        String[] arr = numbers.split("");
        String[] output = new String[arr.length];
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            perm(arr, output, visited, 0, i + 1);
        }

        int answer = 0;
        for (Integer number : set) {
            if (isPrime(number)) answer++;
        }

        return answer;
    }

    public static void perm(String[] arr, String[] output, boolean[] visited, int depth, int r) {
        if (depth == r) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < output.length; i++) {
                if (output[i] != null) {
                    sb.append(output[i]);
                }
            }
            set.add(Integer.parseInt(sb.toString()));
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

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String numbers = "17";
        int solution = solution(numbers); // 3
        System.out.println("solution = " + solution);
    }
}
