package leetcode;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    /*
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '[') {
                stack.push(currentCharacter);
            } else {
                if (stack.isEmpty()) return false;
                char peekCharacter = stack.pop();
                switch (currentCharacter) {
                    case ')':
                        if (peekCharacter != '(') return false;
                        break;
                    case '}':
                        if (peekCharacter != '{') return false;

                        break;
                    case ']':
                        if (peekCharacter != '[') return false;
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
    */

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        boolean output1 = isValid(s1); // true
        System.out.println("output1 = " + output1);

        String s2 = "()[]{}";
        boolean output2 = isValid(s2); // true
        System.out.println("output2 = " + output2);

        String s3 = "(]";
        boolean output3 = isValid(s3); // false
        System.out.println("output3 = " + output3);

        String s4 = "{[]}";
        boolean output4 = isValid(s4); // true
        System.out.println("output4 = " + output4);
    }
}
