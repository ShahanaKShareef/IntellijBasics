package com.sparta.ss;

public class PalindromeChecker1 {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String cleanedStr =str.toLowerCase().replaceAll("[^a-z]", "");
        String sc = String.valueOf(sb.reverse());
        String cleanedString = sc.toLowerCase().replaceAll("[^a-z]", "");
       // String sc = String.valueOf(sb.reverse()).toLowerCase().replaceAll("[^a-z]", "");
       // String cleanedString = sc.toLowerCase().replaceAll("[^a-z]", "");

       return cleanedString.toString().equals(cleanedStr) && str.length() >= 3;
    }
}
