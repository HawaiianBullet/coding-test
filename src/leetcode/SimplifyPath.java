package leetcode;

import java.util.Stack;

// https://leetcode.com/problems/simplify-path/
public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] pathArr = path.split("/");
        for (String dir : pathArr) {
            // 현재 경로 or 연속된 "/"인 경우 - 통과
            if (dir.equals(".") || dir.equals("")) continue;
            // 상위 경로인 경우
            else if (dir.equals("..")) {
                // 만약 stack에 상위 경로가 있는 경우 제거
                if (!stack.isEmpty()) stack.pop();
            } else stack.push(dir); // 경로 추가
        }

        // 경로가 없는 경우 "/" 반환
        if (stack.isEmpty()) return "/";

        // stack에 있는 경로 형식에 맞게 추가
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/");
            sb.append(dir);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String path1 = "/home/";
        String output1 = simplifyPath(path1); // "/home"
        System.out.println("output1 = " + output1);

        String path2 = "/../";
        String output2 = simplifyPath(path2); // "/"
        System.out.println("output2 = " + output2);

        String path3 = "/home//foo/";
        String output3 = simplifyPath(path3); // "/home/foo"
        System.out.println("output3 = " + output3);
    }
}
