package leetcode;

// https://leetcode.com/problems/ransom-note/
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            arr[ransomNote.charAt(i) - 'a']--;
            if (arr[ransomNote.charAt(i) - 'a'] < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        boolean output1 = canConstruct(ransomNote1, magazine1); // false
        System.out.println("output1 = " + output1);

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        boolean output2 = canConstruct(ransomNote2, magazine2); // false
        System.out.println("output2 = " + output2);

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        boolean output3 = canConstruct(ransomNote3, magazine3); // true
        System.out.println("output3 = " + output3);
    }
}
