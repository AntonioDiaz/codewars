package com.kata7;

//https://www.codewars.com/kata/the-old-switcheroo/train/java

public class TheOldSwitcheroo {
    public static String vowel2Index(String input) {
        String output = "";
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String s = String.valueOf(chars[i]);
            output += s.matches("[aeiouAEIOU]")?i+1:s;
        }
        return output;
    }
}
