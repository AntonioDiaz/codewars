package com.kata7;

//https://www.codewars.com/kata/remove-duplicate-words/train/java

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String input){
        String[] s = input.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(s));
        return Arrays.stream(s)
                .map(e -> {
                    if (set.contains(e)) {
                        set.remove(e);
                        return e;
                    }
                    return null;
                })
                .filter(e-> e!=null)
                .collect(Collectors.joining(" "));

    }
}
