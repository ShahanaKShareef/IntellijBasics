package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTests {
    int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
    //int[] sorted = {7, 10, 11, 14, 16, 18, 25, 28, 30, 50};
    @Test
    @DisplayName("Test: Sort an array")
    void checkForBubbleSort() {
        int[] sorted = BubbleSort.bubbleSort(arr);
        Assertions.assertArrayEquals(sorted, arr);
    }

}
