package com.kata7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NicknameGeneratorTest {

    @Test
    public void testing() {
        String input = "Jiamy";
        input.matches(".{2}[aeiou]");
        assertTrue("Jiamy".matches(".{2}[aeiou].*"));
    }

    @Test
    public void testSomething() {
        assertEquals("Jim", NicknameGenerator.nickname("Jimmy"));
        assertEquals("Sam", NicknameGenerator.nickname("Samantha"));
        assertEquals("Error: Name too short", NicknameGenerator.nickname("Sam"));
        assertEquals("Kay", NicknameGenerator.nickname("Kayne"));
        assertEquals("Mel", NicknameGenerator.nickname("Melissa"));
        assertEquals("Jam", NicknameGenerator.nickname("James"));
    }
}
