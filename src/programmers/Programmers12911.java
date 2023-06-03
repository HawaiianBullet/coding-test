package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class Programmers12911 {

    public static int solution(int n) {
        // 2진수로 변환된 값에 포함되어 있는 1을 카운팅 해주는 메서드
        int bitCount = Integer.bitCount(n);
        while (true) {
            int tmpBitCount = Integer.bitCount(++n);
            if (tmpBitCount == bitCount) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        int n1 = 78;
        int solution1 = solution(n1);
        System.out.println("solution1 = " + solution1); // 83

        int n2 = 15;
        int solution2 = solution(n2);
        System.out.println("solution2 = " + solution2); // 23
    }
}
