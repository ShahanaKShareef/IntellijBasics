package com.sparta.ss;

public class PalindromeChecker1 {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str) && str.length() >= 3;
    }
}
