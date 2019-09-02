package com.kata7;

//https://www.codewars.com/kata/nickname-generator/

public class NicknameGenerator {
    public static String nickname(String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return name.matches(".{2}[aeiou].*") ? name.substring(0, 4) : name.substring(0, 3);
    }
}
