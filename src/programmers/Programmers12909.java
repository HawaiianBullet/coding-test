package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Programmers12909 {

    public static boolean solution(String s) {
        if (s.length() == 1) return false;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count < 0) return false;
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                    count++;
                    break;
                case ')':
                    count--;
                    break;
            }
        }

        return count == 0 ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "()()";
        boolean solution1 = solution(s1); // true
        System.out.println("solution1 = " + solution1);

        String s2 = "(())()";
        boolean solution2 = solution(s2); // true
        System.out.println("solution2 = " + solution2);

        String s3 = ")()(";
        boolean solution3 = solution(s3); // false
        System.out.println("solution3 = " + solution3);

        String s4 = "(()(";
        boolean solution4 = solution(s4); // false
        System.out.println("solution4 = " + solution4);
    }
}
