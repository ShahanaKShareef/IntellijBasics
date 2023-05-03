package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeChecker1Tests {
    @ParameterizedTest
    @ValueSource(strings = {"Malayalam","maDam"})
    @DisplayName("Test Case 1: Check for palindrome")
    void checkForPalindrome(String word){
        Assertions.assertEquals(true,PalindromeChecker1.isPalindrome(word));
    }
    @ParameterizedTest
    @ValueSource(strings = {"maiden","leave"})
    @DisplayName("Test Case 2: Not a Palindrome")
    void checkForNotPalindrome(String word){
        Assertions.assertEquals(false,PalindromeChecker1.isPalindrome(word));
    }
}
