package leetcode;

// https://leetcode.com/problems/add-digits/
public class AddDigits {

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;
    }

    // 다른 사람 풀이 참고
    // 각 자리수를 더한 값을 9로 나눌 수 있다면 각 자리수를 더한 값을 반복적으로 실행하면 결국 9가 된다.
    // 따라서 각 자리수를 9로 나눈 나머지 값이 0이면 9를 반환하고 아닌 경우는 나머지를 반환하면 된다.
    public static int addDigits2(int num) {
        if (num == 0) return 0;
        else if (num % 9 == 0) return 9;
        else return num % 9;
    }

    public static void main(String[] args) {
        int num1 = 38;
        int output1 = addDigits(num1); // 2
        System.out.println("output1 = " + output1);

        int num2 = 0;
        int output2 = addDigits(num2); // 0
        System.out.println("output2 = " + output2);
    }
}
