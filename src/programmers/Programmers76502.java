package programmers;

import java.util.Stack;

public class Programmers76502 {

    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String movedStr = s.substring(i) + s.substring(0, i);
            if (isValidStr(movedStr)) answer++;
        }
        return answer;
    }

    private static boolean isValidStr(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                if (c == ')' || c == '}' || c == ']') return false;
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "[](){}";
        int solution1 = solution(s1); // 3
        System.out.println("solution1 = " + solution1);

        String s2 = "}]()[{";
        int solution2 = solution(s2); // 2
        System.out.println("solution2 = " + solution2);

        String s3 = "[)(]";
        int solution3 = solution(s3); // 0
        System.out.println("solution3 = " + solution3);

        String s4 = "}}}";
        int solution4 = solution(s4); // 0
        System.out.println("solution4 = " + solution4);


    }
}
