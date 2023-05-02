package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Check that 5,8,12 returns Good Morning")
    void checkForGoodMorning(int time){
        Assertions.assertEquals("Good morning!",Program.getGreeting(time));
    }
    @ParameterizedTest
    @ValueSource(ints = {12,16,17})

    void checkForGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!",Program.getGreeting(time));
    }
    @ParameterizedTest
    @ValueSource(ints = {18,20,23})

    void checkForGoodEvening(int time){
        Assertions.assertEquals("Good evening!",Program.getGreeting(time));
    }

}
