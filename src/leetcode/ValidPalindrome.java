package leetcode;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    /*
    // [내 풀이]
    // 1. 정규식을 활용해서 alphanumeric 추출 + 대문자는 소문자로 변경
    // 2. left, right two pointer를 활용해서 palindrome 여부 확인
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (str.equals("")) return true;

        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    */

    // [다른 사람 풀이 참고]
    // 정규식을 사용하지 않고 Character.isLetterOrDigit 메서드 사용
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        boolean palindrome1 = isPalindrome(s1);
        System.out.println("palindrome1 = " + palindrome1);

        String s2 = "race a car";
        boolean palindrome2 = isPalindrome(s2);
        System.out.println("palindrome2 = " + palindrome2);

        String s3 = " ";
        boolean palindrome3 = isPalindrome(s3);
        System.out.println("palindrome3 = " + palindrome3);

        String s4 = "0P";
        boolean palindrome4 = isPalindrome(s4);
        System.out.println("palindrome4 = " + palindrome4);
    }

}
