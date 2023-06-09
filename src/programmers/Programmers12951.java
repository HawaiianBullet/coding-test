package programmers;

import java.util.StringTokenizer;

// https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class Programmers12951 {

    public static String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.equals(" ")) {
                sb.append(" ");
            } else {
                sb.append(word.substring(0,1).toUpperCase());
                sb.append(word.substring(1));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "3people unFollowed me";
        String solution1 = solution(s1);
        System.out.println("solution1 = " + solution1); // "3people Unfollowed Me"

        String s2 = "for the last week";
        String solution2 = solution(s2);
        System.out.println("solution2 = " + solution2); // "For The Last Week"
    }
}
