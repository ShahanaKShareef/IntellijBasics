package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @ParameterizedTest
    @ValueSource(ints = {5,8,24})
    @DisplayName("Test Case 1:")
    void checkForGoodMorning(int time){
        Assertions.assertEquals("Good morning!",Program.getGreeting(time));
    }
    @ParameterizedTest
    @ValueSource(ints = {12,16,17})
    @DisplayName("Test Case 2:")
    void checkForGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!",Program.getGreeting(time));
    }
    @ParameterizedTest
    @ValueSource(ints = {18,20,23})
    @DisplayName("Test Case 3:")
    void checkForGoodEvening(int time){
        Assertions.assertEquals("Good evening!",Program.getGreeting(time));
    }

}
