package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,13,11,14,12})
    @DisplayName("Test Case 1:")
    void availableClassifications (int age){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.getAgeOfViewer(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Test Case 2:")
    void availableClassifications15 (int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.getAgeOfViewer(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19,100})
    @DisplayName("Test Case 3:")
    void availableClassifications18 (int age){
        Assertions.assertEquals("All films are available.",FilmClassifications.getAgeOfViewer(age));
    }

}
