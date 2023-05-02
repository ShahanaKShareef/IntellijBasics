package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTests {
    @Test
    @DisplayName("Check that 7 returns Good Morning")
    void basicTest(){
        Assertions.assertEquals("Good morning!",Program.getGreeting(7));
    }
}
