package leetcode;

// https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        String[] sArr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = sArr.length - 1; i >= 0; i--) {
            sb.append(sArr[i]);
            if (i == 0) break;
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String output1 = reverseWords(s1); // "blue is sky the"
        System.out.println("output1 = " + output1);

        String s2 = "  hello world  ";
        String output2 = reverseWords(s2); // "world hello"
        System.out.println("output2 = " + output2);

        String s3 = "a good   example";
        String output3 = reverseWords(s3); // "example good a"
        System.out.println("output3 = " + output3);
    }
}
