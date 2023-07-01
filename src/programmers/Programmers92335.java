package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/92335
public class Programmers92335 {

    public static int solution(int n, int k) {
        int answer = 0;
        String[] convertKArr = convertDecimalToK(n, k).split("0");
        for (String convertK : convertKArr) {
            if (convertK.equals("")) continue;
            if (isPrime(Long.parseLong(convertK))) answer++;
        }

        return answer;
    }

    private static String convertDecimalToK(int n, int k) {
        String convertedStr = "";
        while (n > 0) {
            int r = n % k;
            convertedStr = r + convertedStr;
            n /= k;
        }

        return convertedStr;
    }

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }


    public static void main(String[] args) {
//        int n = 437674;
//        int k = 3;
//        int solution = solution(n, k); // 3
//        System.out.println("solution = " + solution);
        int n = 110011;
        int k = 10;
        int solution = solution(n, k); // 2
        System.out.println("solution = " + solution);
    }

}
