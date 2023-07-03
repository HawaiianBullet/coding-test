package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Programmers84512 {

    public static int solution(String word) {
        String str = "AEIOU";
        int[] arr = {781, 156, 31, 6, 1};
        int answer = word.length(); // 최소값 ex) AAA - 3
        for (int i = 0; i < word.length(); i++) {
            answer += (str.indexOf(word.charAt(i)) * arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String word = "AAAAE";
        int solution = solution(word); // 6
        System.out.println("solution = " + solution);
    }
}
