package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeChecker1_Tests {
    @ParameterizedTest
    @ValueSource(strings = {"malayalam","madam"})
    @DisplayName("Test Case 1:")
    void checkForPalindrome(String word){
        Assertions.assertEquals(true,PalindromeChecker1.isPalindrome(word));
    }
}
