package com.kata6;

//https://www.codewars.com/kata/count-the-smiley-faces/train/java

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int)arr.stream().filter(e -> e.matches("[:;][-~]?[)D]")).count();
    }
}
