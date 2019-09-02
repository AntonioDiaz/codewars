package com.kata7;

//https://www.codewars.com/kata/complementary-dna/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class ComplementaryDna {

    public static String makeComplement(String dna) {
        return Arrays.stream(dna.split(""))
                .map(e -> complement(e).toString())
                .collect(Collectors.joining());
    }

    private static Object complement(String e) {
        switch (e) {
            case "A": return "T";
            case "T": return "A";
            case "G": return "C";
            case "C": return "G";
            default: return "";
        }
    }

}
