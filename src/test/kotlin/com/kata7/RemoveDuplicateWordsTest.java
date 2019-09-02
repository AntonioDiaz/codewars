package com.kata7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.stream.Collectors;


public class RemoveDuplicateWordsTest {

    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }

    @Test
    public void attemps() {
        String input01 = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String[] s = input01.split(" ");
        assertEquals(14, s.length);
        Set<String> set = new HashSet<>(Arrays.asList(s));
        assertEquals(4, set.size());
        String noRepeatedWord = Arrays.stream(s)
                .map(e -> {
                    if (set.contains(e)) {
                        set.remove(e);
                        return e;
                    }
                    return null;
                })
                .filter(e-> e!=null)
                .collect(Collectors.joining(" "));
        //String collect1 = collect.stream().collect(Collectors.joining(" "));
        System.out.println(noRepeatedWord);
    }

}
