package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/135807
public class Programmers135807 {

    public static int solution(int[] arrayA, int[] arrayB) {
        int gcdA = getGcdFromArray(arrayA, arrayB, 0);
        int gcdB = getGcdFromArray(arrayB, arrayA, 0);

        return Math.max(gcdA, gcdB);
    }

    public static int getGcdFromArray(int[] arrayA, int[] arrayB, int gcd) {
        // arrayA 숫자의 최대공약수 찾기
        for (int i = 0; i < arrayA.length; i++) {
            gcd = getGcd(gcd, arrayA[i]);
        }
        // arrayA의 최대공약수가 arrayB 숫자로 나뉘면 0으로 리턴
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] % gcd == 0) {
                gcd = 0;
                break;
            }
        }
        return gcd;
    }

    public static int getGcd(int num1, int num2) {
        int res = 0;
        while (num2 > 0) {
            int tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
            res = num1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arrayA = {14, 35, 119};
        int[] arrayB = {18, 30, 102};
        int solution = solution(arrayA, arrayB); // 7
        System.out.println("solution = " + solution);
    }
}
