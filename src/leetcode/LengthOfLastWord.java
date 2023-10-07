package leetcode;

public class LengthOfLastWord {

    // 내 풀이
    // 연속된 공백 기준으로 문자열 자른후, 마지막 문자 크기 반환
//    public static int lengthOfLastWord(String s) {
//        String[] sArr = s.strip().split("\\s+");
//        return sArr[sArr.length - 1].length();
//    }

    // 다른 사람 풀이 참고
    public static int lengthOfLastWord(String s) {
        String str = s.strip(); // 문자열 앞뒤 공백 제거
        int cnt = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            // 문자열 마지막부터 공백나오기 전까지 for문 동작
            if (str.charAt(i) == ' ') break;
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        int output1 = lengthOfLastWord(s1); // 5
        System.out.println("output1 = " + output1);

        String s2 = "   fly me   to   the moon  ";
        int output2 = lengthOfLastWord(s2); // 4
        System.out.println("output2 = " + output2);

        String s3 = "luffy is still joyboy";
        int output3 = lengthOfLastWord(s3); // 6
        System.out.println("output3 = " + output3);
    }
}
