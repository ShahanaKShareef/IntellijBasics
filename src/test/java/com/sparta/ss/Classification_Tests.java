package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {
    @ParameterizedTest
    @ValueSource(ints = {13,14,12})
    @DisplayName("Check that 3,8,12 returns U, PG & 12 films are available.")
    void availableClassifications (int age){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.getAgeOfViewer(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    void availableClassifications15 (int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.getAgeOfViewer(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19,25})
    void availableClassifications18 (int age){
        Assertions.assertEquals("All films are available.",FilmClassifications.getAgeOfViewer(age));
    }

}
