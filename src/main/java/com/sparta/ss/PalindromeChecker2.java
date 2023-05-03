package com.sparta.ss;

public class PalindromeChecker2 {
    public static String findLongestPalindrome(String[] sentence) {
        String longestPalindrome = "";

        for (String word : sentence) {
            if (PalindromeChecker1.isPalindrome(word) && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }
        return longestPalindrome;
    }

}
