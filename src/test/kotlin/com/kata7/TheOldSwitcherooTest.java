package com.kata7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TheOldSwitcherooTest {

    @Test
    public void testing() {
        String input = "this is my string";
        String output = "th3s 6s my str15ng";
        String temp = "";
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String s = String.valueOf(chars[i]);
            temp += s.matches("[aeiouAEIOU]")?i+1:s;
        }
        assertEquals(output, temp);
    }


    @Test public void test1() {
        assertEquals("th3s 6s my str15ng", TheOldSwitcheroo.vowel2Index("this is my string"));
    }

    @Test public void test2() {
        assertEquals("C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld", TheOldSwitcheroo.vowel2Index("Codewars is the best site in the world"));
    }
    @Test public void test3() {
        assertEquals("T2m4rr7w 10s g1415ng t20 b23 r2627n29ng", TheOldSwitcheroo.vowel2Index("Tomorrow is going to be raining"));
    }
    @Test public void test4() {
        assertEquals("", TheOldSwitcheroo.vowel2Index(""));
    }

}
