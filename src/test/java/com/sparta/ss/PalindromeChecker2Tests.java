package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeChecker2Tests {
    @Test
    @DisplayName("Test Case 1: Check for longest palindrome")
    void checkLongestPalindrome() {
        String[] sentence = {"My", "name", "is","layal", "I", "speak", "malayalam"};
        Assertions.assertEquals("malayalam",PalindromeChecker2.findLongestPalindrome(sentence));
    }

}
